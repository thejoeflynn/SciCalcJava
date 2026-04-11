package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    private double currentValue;
    public Calculator() {
        this.currentValue = 0.0;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void clearDisplay() {
        currentValue = 0.0;
    }
    public void changeNumber(double newValue) {
        currentValue = newValue;
    }
}

