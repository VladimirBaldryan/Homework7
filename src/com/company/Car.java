package com.company;

public class Car {
    private String model;
    private String year;
    private int speed;

    public void Car(String model, String year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void printCar(String model, String year, int speed) {
        System.out.println("My car is " + model + ", made in " + year + " year, and maximal speed is " + speed + "km/h");
    }
}
