package oneToOne;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Student {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
	String standard;
	long phone;
	String email;
	
	@OneToOne(mappedBy = "student")
	Address address;
	 
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(long id, String name, String standard, long phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.phone = phone;
		this.email = email;
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStandard() {
		return standard;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", phone=" + phone + ", email="
				+ email + ", address=" + address + "]";
	}

	
	

}
