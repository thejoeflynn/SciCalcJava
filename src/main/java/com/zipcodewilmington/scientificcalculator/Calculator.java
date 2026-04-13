package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    protected double currentValue;
    protected boolean isError;

    public Calculator() {
        this.currentValue = 0.0;
        this.isError = false;
    }

    public String getDisplay() {
        if (isError) {
            return "ERROR";
        } else {
            return String.valueOf(currentValue);
        }
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void clearDisplay() {
        currentValue = 0.0;
        isError = false;
    }
    public void changeNumber(double newValue) {
        if (isError) {
            return;
        }
        currentValue = newValue;
    }

    public void add(double value) {
        if (isError) {
            return;
        }
        currentValue += value;
    }

    public void subtract(double value) {
        if (isError) {
            return;
        }
        currentValue -= value;
    }

    public void multiply(double value) {
        if (isError) {
            return;
        }
        currentValue *= value;
    }

    public void divide(double value) {
        if (isError) {
            return;
        }
        if (value != 0) {
            currentValue /= value;
        } else {
            isError = true;
        }
    }

    public void exponentiate(double exponent) {
        if (isError) {
            return;
        }
        currentValue = Math.pow(currentValue, exponent);
    }
}


