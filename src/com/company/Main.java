package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar = new Car();
        myCar.Car(myCar.getModel(), myCar.getYear(), myCar.getSpeed());
        System.out.println("Please input car model");
        myCar.setModel(scanner.next());
        System.out.println("Please input car made year");
        myCar.setYear(scanner.next());
        System.out.println("Please input car max speed");
        myCar.setSpeed(scanner.nextInt());
        myCar.printCar(myCar.getModel(), myCar.getYear(), myCar.getSpeed());
    }
}