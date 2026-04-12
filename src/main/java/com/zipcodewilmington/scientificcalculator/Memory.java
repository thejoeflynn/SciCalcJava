package com.zipcodewilmington.scientificcalculator;

public class Memory extends ScientificCalculator {
  
    private double memoryValue;

    public Memory() {
        super();
        this.memoryValue = 0.0;
    }

    public void memoryAdd(double value) {
        memoryValue += value;
    }

    public double memoryRecall() {
        return memoryValue;
    }

    public void memoryClear() {
        memoryValue = 0.0;
    }

    public void memoryStore() {
        memoryValue = currentValue;
    }
}

