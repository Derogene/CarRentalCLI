package com.careerdevs;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Car Rental CLI");

//        Car testCar = new Car("Ford", "F150");

        //traditional / standard array
        //create list/arr
        Car[] carStorage = new Car[3];

        //create obj instances
        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy", "Cruze");
        Car car3 = new Car("Toyota", "Corolla");


        //store obj instances in list/arr
        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        //Problem: how do we list just Rented/Available cars?

        car2.setRented(true);

        //solution (std arr): iterate through the array, only display cars where isRented is false
        System.out.println("Available Cars:");
        int listNumber = 1;
        for (int i = 0; i < carStorage.length; i++) {
            if ( !carStorage[i].isRented() ) {
                System.out.println( "("+ listNumber + ") " + carStorage[i].getName() );
                listNumber++;
            }
        }

        //outputgoal
        /*
        * Available Cars:
            * Honda Accord
            * Toyota Corolla
            * */

        System.out.println("All Cars:");
        for (int i = 0; i < carStorage.length; i++) {
            String carStatus;
            if ( !carStorage[i].isRented() ) {
                carStatus = "Available";
            } else {
                carStatus = "Unavailable";
            }
            System.out.println( "(" + (i + 1) + ") " + carStorage[i].getName() + " (" + carStatus + ")" );
        }

    }
}
