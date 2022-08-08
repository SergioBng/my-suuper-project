package com.trutsyn.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Sergey Trutsyn 04.08.2022
 */
@Component
@Scope("prototype")
public class Sharing {
    @Qualifier("car")
    @Autowired
    private Vehicle vehicle;

    public void bookVehicle() {
        System.out.println("Your action:::" + vehicle.book());
    }
}
