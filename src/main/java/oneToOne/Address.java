package oneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String streetNo;
	String city;
	String state;
	String country;
	long pin;
	
	@OneToOne
	@JoinColumn(name = "student_id")
	Student student;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(long id, String streetNo, String city, String state, String country, long pin) {
		super();
		this.id = id;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", streetNo=" + streetNo + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pin=" + pin + ", student=" + student + "]";
	}
	
	
	
}
