package org.hql.test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
    
    @Id
    long carId;
    String carNumber;
    String color;
    String brand;
    String model;
    
    @OneToOne
    Driver driver;
    
    public Car() {
        
    }


    public Car(long carId, String carNumber, String color, String brand, String model, Driver driver) {
        
        this.carId = carId;
        this.carNumber = carNumber;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.driver = driver;
    }


    public Driver getDriver() {
        return driver;
    }





    public void setDriver(Driver driver) {
        this.driver = driver;
    }





    public long getCarId() {
        return carId;
    }


    public void setCarId(long carId) {
        this.carId = carId;
    }


    public String getCarNumber() {
        return carNumber;
    }


    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }





    @Override
    public String toString() {
        return "Car [carId=" + carId + ", carNumber=" + carNumber + ", color=" + color + ", brand=" + brand + ", model="
                + model + ", driver=" + driver + "]";
    }


    
    
    

}

