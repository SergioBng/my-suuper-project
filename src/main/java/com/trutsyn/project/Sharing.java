package com.trutsyn.project;

import org.springframework.stereotype.Component;

/**
 * @author Sergey Trutsyn 04.08.2022
 */
@Component
public class Sharing {
    private Vehicle vehicle;

    public void bookVehicle() {
        System.out.println("Your action:::" + vehicle.book());
    }
}
