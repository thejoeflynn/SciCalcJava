package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator extends Calculator {

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
        if (currentValue >= -1 && currentValue <= 1) {
            currentValue = Math.asin(currentValue);
        } else {
            isError = true;
        }
    }

    public void cosInverse() {
        if (isError) {
            return;
        }
        if (currentValue >= -1 && currentValue <= 1) {
            currentValue = Math.acos(currentValue);
        } else {
            isError = true;
        }
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

    public void percentage() {
        if (isError) {
            return;
        }
        currentValue = currentValue / 100.0;
    }
}