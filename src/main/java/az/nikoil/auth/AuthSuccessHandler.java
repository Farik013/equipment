package az.nikoil.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class AuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Override
	protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String role = auth.getAuthorities().toString();

		String targetUrl = "";
		if (role.contains("ROLE_ADMIN")) {
			targetUrl = "/superAdmin";
		} else if (role.contains("ROLE_IT")) {
			targetUrl = "/it";
		} else if (role.contains("ROLE_ACCAUNT")) {
			targetUrl = "/accaunt";
		} else if (role.contains("ROLE_MANAGER")) {
			targetUrl = "/manager";
		}
		return targetUrl;
	}

}
