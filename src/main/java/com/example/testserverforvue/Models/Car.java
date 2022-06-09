package com.example.testserverforvue.Models;

public class Car {
    private int power;
    private String model;

    public Car(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }
}
