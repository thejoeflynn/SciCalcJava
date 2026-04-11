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

    public void add(double value) {
        currentValue += value;
    }

    public void subtract(double value) {
        currentValue -= value;
    }

    public void multiply(double value) {
        currentValue *= value;
    }

    public void divide(double value) {
        if (value != 0) {
            currentValue /= value;
        } else {
            throw new IllegalArgumentException("ERROR");
        }
    }

    public void exponentiate(double exponent) {
        currentValue = Math.pow(currentValue, exponent);
    }

    public void square() {
        currentValue = Math.pow(currentValue, 2);
    }

    public void squareRoot() {
        if (currentValue >= 0) {
            currentValue = Math.sqrt(currentValue);
        } else {
            throw new IllegalArgumentException("ERROR");
        }
    }

    public void invertSign() {
        currentValue = -currentValue;
    }

    public void inverse() {
        if (currentValue != 0) {
            currentValue = 1 / currentValue;
        } else {
            throw new IllegalArgumentException("ERROR");
        }
    }


}

