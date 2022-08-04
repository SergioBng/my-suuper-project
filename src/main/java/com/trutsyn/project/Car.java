package com.trutsyn.project;

import org.springframework.stereotype.Component;

/**
 * @author Sergey Trutsyn 04.08.2022
 */
@Component
public class Car implements Vehicle {
    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String book() {
        return "you book car: model - " + model + ", color - " + color;
    }
}
