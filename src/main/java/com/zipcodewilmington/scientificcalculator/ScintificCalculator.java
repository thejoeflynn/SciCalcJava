package com.zipcodewilmington.scientificcalculator;

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
