package com.trutsyn.project;

/**
 * @author Sergey Trutsyn 04.08.2022
 */
public class Bicycle implements Vehicle{
    private String model;
    private String color;

    public Bicycle(String model, String color) {
        this.model = model;
        this.color = color;
    }

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
        return "you book bicycle: model - " + model + ", color - " + color;
    }
}
