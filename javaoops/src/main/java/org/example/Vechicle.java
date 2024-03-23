package org.example;

class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class ElectricCar extends Vehicle {
    private String batteryType;

    public ElectricCar(String brand, String batteryType) {
        super(brand); // Calling the parent class constructor (inheritance)
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }
}




