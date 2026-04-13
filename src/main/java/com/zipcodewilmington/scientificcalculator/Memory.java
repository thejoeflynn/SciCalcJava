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

    public void memoryRecall() {
        currentValue = memory;
    }

    public void memoryClear() {
        memory = 0.0;
    }

    public void memoryStore() {
        memory = currentValue;
    }
}

