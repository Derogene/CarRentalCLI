package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private boolean isRented; //could set this equal to false
//    private boolean availalble;

    public Car(String make, String model)/* boolean can be removed if field || constructor is assigned a boolean*/ {
        this.make = make;
        this.model = model;
        this.isRented = false; //could set this equal to false if the field is not assigned a boolean
    }
    //getters and setters; we want to customize the getters for specificity

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean b) {
        isRented = b;
    }

    public String getName() {
        return make + " " + model;
    }

//    public boolean isAvailalble() {
//        return available;
//    }

}
