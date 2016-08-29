package az.nikoil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "equipment")
@NamedQueries({ @NamedQuery(name = "findByUser", query = "SELECT e FROM Equipment e WHERE e.user = :user"),
		@NamedQuery(name = "allEquip", query = "SELECT e FROM Equipment e") })
public class Equipment {

	private int id;
	private String brand;
	private String model;
	private String inventoryNumber;
	private String serialNumber;
	private String type;
	private String note;
	private User user;

	public Equipment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipment(int id, String brand, String model, String inventoryNumber, String serialNumber, String type,
			String note, User user) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.inventoryNumber = inventoryNumber;
		this.serialNumber = serialNumber;
		this.type = type;
		this.note = note;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "brand", unique = true)
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "model")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "inventory_number", unique = true)
	public String getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(String inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	@Column(name = "serial_number", unique = true)
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Column(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "note")
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "username")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
