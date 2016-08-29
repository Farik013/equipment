package az.nikoil.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import az.nikoil.model.Department;
import az.nikoil.model.User;
import az.nikoil.service.DepartmentService;
import az.nikoil.service.UserSevice;

@Controller
public class UserController {

	@Autowired
	private UserSevice userService;

	@Autowired
	private DepartmentService departmentService;

	private User user;
	private Department department;

	@RequestMapping(value = "superAdmin", method = RequestMethod.GET)
	private ModelAndView getAllUsers() {
		ModelAndView model = new ModelAndView();
		model.addObject("allUsers", userService.getAllUsers());
		for (User user : userService.getAllUsers()) {
			String username = user.getUsername();
			user = userService.findByUserName(username);
			int departmentId = user.getDepartment().getDepId();
			department = departmentService.findByDepartmentId(departmentId);
			model.addObject("department", department.getName());
		}
		model.setViewName("superAdmin");
		return model;
	}

	@RequestMapping(value = "insertUser", method = RequestMethod.GET)
	private ModelAndView insertUserPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("newUser", new User());
		model.setViewName("insertUser");
		return model;
	}

	@RequestMapping(value = "insertUser", method = RequestMethod.POST)
	private ModelAndView insertUser(@ModelAttribute("users") User user, BindingResult result) {
		ModelAndView model = new ModelAndView();
		userService.insert(user);
		model.addObject("allUsers", userService.getAllUsers());
		model.setViewName("superAdmin");
		return model;
	}

	@RequestMapping(value = "/updateUser/{username}", method = RequestMethod.GET)
	private ModelAndView updateUserPage(@PathVariable("username") String username) {
		ModelAndView model = new ModelAndView();
		model.addObject("getUser", userService.findByUserName(username));
		model.setViewName("updateUser");
		return model;
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	private ModelAndView updateUser(@RequestParam("depName") String departmentName, @ModelAttribute("users") User user,
			BindingResult result) {
		ModelAndView model = new ModelAndView();
		department = departmentService.findByDepartmentName(departmentName);
		user.setDepartment(department);
		userService.update(user);
		model.addObject("allUsers", userService.getAllUsers());
		model.setViewName("superAdmin");
		return model;
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	private ModelAndView deleteUser(@RequestParam("username") String username) {
		ModelAndView model = new ModelAndView("superAdmin");
		userService.delete(username);
		model.addObject("allUsers", userService.getAllUsers());
		model.setViewName("superAdmin");
		return model;
	}
}
