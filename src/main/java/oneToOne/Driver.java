package oneToOne;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Driver {

	@Id
	long driverId;
	String name;
	String address;
	long phone;
	
	@OneToOne
	@JoinColumn(name="car_id")
	Car car;

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(long driverId, String name, String address, long phone) {
		super();
		this.driverId = driverId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}

	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", car=" + car + "]";
	}

	
	
}

