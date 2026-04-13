package com.zipcodewilmington.scientificcalculator;

public class Memory extends ScientificCalculator {
  
    private double memory;

    public Memory() {
        super();
        this.memory = 0.0;
    }

    public void memoryAdd() {
        memory += currentValue;
    }

    public void memoryAdd(double value) {
        if (isError) {
            return;
        }
        memory += value;
    }

    public void memoryRecall() {
        if (isError) {
            return;
        }
        currentValue = memory;
    }

    public void memoryClear() {
        if (isError) {
            return;
        }
        memory = 0.0;
    }

    public void memoryStore() {
        if (isError) {
            return;
        }
        memory = currentValue;
    }
}

