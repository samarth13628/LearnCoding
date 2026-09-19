package org.example;

class Vehicle {
    private int year = 0;
    
    public int getYear() {
        return year;
    }

    public void setYear(int yearManufactured) {
        this.year = yearManufactured;
    }

    // PRIVATE: Locked inside Vehicle
    private boolean ignitionOn = false; 

    // GETTER: Let others check if the vehicle is started
    public boolean isIgnitionOn() {
        return ignitionOn;
    }

    // SETTER: Let others turn the vehicle on or off safely
    public void setIgnitionOn(boolean status) {
        this.ignitionOn = status;
    }

    public void move() {
        if (ignitionOn) {
            System.out.println("The vehicle is moving.");
        } else {
            System.out.println("Cannot move. The ignition is off.");
        }
    }
    public void stop() {
       ignitionOn = true;
       system.out.println("The vehicle has stopped.");
    }
}