package com.trutsyn.project;

/**
 * @author Sergey Trutsyn 04.08.2022
 */
public class Sharing {
    private Vehicle vehicle;

    public Sharing(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void bookVehicle() {
        System.out.println("Your action:::" + vehicle.book());
    }
}
