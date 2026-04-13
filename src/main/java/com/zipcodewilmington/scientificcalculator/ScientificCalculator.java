package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator extends Calculator {

    protected String trigMode;

    public ScientificCalculator() {
        super();
        this.trigMode = "degrees";

    }

    public void switchUnitsMode(String mode) {
        if (trigMode.equalsIgnoreCase("degrees")) {
            trigMode = "degrees";
        } else {
            trigMode = "radians";
        }
        
        if (mode.equalsIgnoreCase("degrees")) {
            trigMode = "degrees";
        } else if (mode.equalsIgnoreCase("radians")) {
            trigMode = "radians";
        } else {
            isError = true;
        }
    }

    public void sin() {
        if (isError) {
            return;
        }
        if (trigMode.equalsIgnoreCase("degrees")) {
            currentValue = Math.sin(Math.toRadians(currentValue));
        } else {
            currentValue = Math.sin(currentValue);
        }
    }

    public void cos() {
        if (isError) {
            return;
        }
        if (trigMode.equalsIgnoreCase("degrees")) {
            currentValue = Math.cos(Math.toRadians(currentValue));
        } else {
            currentValue = Math.cos(currentValue);
        }
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

    public void square() {
        if (isError) {
            return;
        }
        currentValue = currentValue * currentValue;
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
