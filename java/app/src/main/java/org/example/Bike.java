package org.example;

public class Bike extends Vehicle {
    private String model;
    private String make;

    public Bike(String model, String make) {
        super();
        this.model = model;
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String modelName) {
        this.model = modelName;
    }

    public String getMake() {
        return make;
    }

    @Override
     public void move() {
        if (this.isIgnitionOn()) {
            System.out.println("The " + this.make + " " + this.model + " is moving.");
        } else {
            System.out.println("Cannot move " + this.make + " " + this.model + ". The ignition is off.");
        }
    }

    public void kickStart() {
        if (this.isIgnitionOn()) {
            System.out.println("Cannot kick start while the ignition is on.");
        } else {
            this.setIgnitionOn(true);
            System.out.println("The " + this.make + " " + this.model + " has been kick started.");
        }
    }
    
}
