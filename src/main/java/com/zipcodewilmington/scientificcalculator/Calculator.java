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

    public void sin() {
        if (isError) {
            return;
        }
        currentValue = Math.sin(currentValue);
    }

    public void cos() {
        if (isError) {
            return;
        }
        currentValue = Math.cos(currentValue);
    }

    public void tan() {
        if (isError) {
            return;
        }
        currentValue = Math.tan(currentValue);
    }

    public void sinInverse() {
        if (isError) {
            return;
        }
        currentValue = Math.asin(currentValue);
    }

    public void cosInverse() {
        if (isError) {
            return;
        }
        currentValue = Math.acos(currentValue);
    }

    public void tanInverse() {
        if (isError) {
            return;
        }
        currentValue = Math.atan(currentValue);
    }

    public void log() {
        if (isError) {
            return;
        }
        if (currentValue > 0) {
            currentValue = Math.log10(currentValue);
        } else {
            isError = true;
        }
    }

    public void naturalLog() {
        if (isError) {
            return;
        }
        if (currentValue > 0) {
            currentValue = Math.log(currentValue);
        } else {
            isError = true;
        }
    }

    public void inverseLog() {
        if (isError) {
            return;
        }
        currentValue = Math.pow(10, currentValue);
    }

    public void inverseNaturalLog() {
        if (isError) {
            return;
        }
        currentValue = Math.exp(currentValue);
    }

    public void factorial() {
        if (isError) {
            return;
        }
        if (currentValue < 0 || currentValue != Math.floor(currentValue)) {
            isError = true;
            return;
        }
        double result = 1.0;
        for (int i = 1; i <= (int) currentValue; i++) {
            result *= i;
        }
        currentValue = result;
    }

    public void abs() {
        if (isError) {
            return;
        }
        currentValue = Math.abs(currentValue);
    }
    

    

enum displayMode {
    DECIMAL, BINARY, OCTAL, HEXADECIMAL
}

public class ScintificCalculator {
    private double currentValue;
    private displayMode currentDisplayMode;

    public ScintificCalculator() {
        this.currentValue = 0.0;
        this.currentDisplayMode = displayMode.DECIMAL;
    }

    public void switchDisplayMode(displayMode newMode) {
        this.currentDisplayMode = newMode;
    }

    public String getDisplay() { 
        switch (currentDisplayMode) {
            case DECIMAL:
                return Double.toString(currentValue);
            case BINARY:
                return Integer.toBinaryString((int) currentValue);
            case OCTAL:
                return Integer.toOctalString((int) currentValue);
            case HEXADECIMAL:
                return Integer.toHexString((int) currentValue);
            default:
                return Double.toString(currentValue);
        }
    }
}

}

