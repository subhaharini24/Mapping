package org.hql.test;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

    @Id
    long driverId;
    String name;
    String address;
    long phone;
    
    public Driver() {
        
    }

    public Driver(long driverId, String name, String address, long phone) {
        
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

    @Override
    public String toString() {
        return "Driver [driverId=" + driverId + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
    }
    
    
    
}

