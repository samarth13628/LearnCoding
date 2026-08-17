package org.example;

class Car extends Vehicle {
    private String model;
    private String make;

    public Car(String model, String make) {
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

    public void openTrunk() {
        if (this.isIgnitionOn()) {
            System.out.println("Cannot open the trunk while the ignition is on.");
        } else {
            System.out.println("The trunk of the " + this.make + " " + this.model + " is now open.");
        }
    }

    public void closeTrunk() {
        System.out.println("The trunk of the " + this.make + " " + this.model + " is now closed.");
    }
}