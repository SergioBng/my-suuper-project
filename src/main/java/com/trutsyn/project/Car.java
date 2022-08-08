package com.trutsyn.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Sergey Trutsyn 04.08.2022
 */
@Component
public class Car implements Vehicle {
    @Value("${sharing.model}")
    private String model;
    @Value("${sharing.color}")
    private String color;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String book() {
        return "you book car: model - " + model + ", color - " + color;
    }
}
