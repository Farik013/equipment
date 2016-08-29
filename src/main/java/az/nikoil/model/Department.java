package az.nikoil.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
@NamedQuery(name = "allDepartments", query = "SELECT d FROM Department d")
public class Department {

	private int depId;
	private String name;
	private String adress;
	private Set<User> user = new HashSet<User>();

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int depId, String name, String adress, Set<User> user) {
		super();
		this.depId = depId;
		this.name = name;
		this.adress = adress;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "department_id", unique = true)
	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "department")
	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

}
