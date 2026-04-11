package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    private double currentValue;
    private boolean isError;

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

    public void square() {
        if (isError) {
            return;
        }
        currentValue = Math.pow(currentValue, 2);
    }

    public void squareRoot() {
        if (isError) {
            return;
        }
        if (currentValue >= 0) {
            currentValue = Math.sqrt(currentValue);
        } else {
            isError = true;
        }
    }

    public void invertSign() {
        if (isError) {
            return;
        }
        currentValue = -currentValue;
    }

    public void inverse() {
        if (isError) {
            return;
        }
        if (currentValue != 0) {
            currentValue = 1 / currentValue;
        } else {
            isError = true;
        }
    }


}

