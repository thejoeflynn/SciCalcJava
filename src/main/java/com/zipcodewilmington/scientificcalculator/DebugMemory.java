package com.zipcodewilmington.scientificcalculator;

public class DebugMemory {
    public static void main(String[] args) {
        Memory m = new Memory();
        System.out.println("initial memory: " + m.getDisplay());
        m.setDisplay(5.0);
        m.memoryStore();
        System.out.println("after store(5): memory recall -> " + m.getCurrentValue());
        m.setDisplay(0.0);
        System.out.println("set display 0: currentValue=" + m.getCurrentValue());
        m.divide(0);
        System.out.println("after divide 0: isError? " + m.isError + " currentValue=" + m.getCurrentValue());
        m.setDisplay(99.0);
        System.out.println("after setDisplay(99) attempt: currentValue=" + m.getCurrentValue());
        m.memoryStore();
        System.out.println("after memoryStore while error: memory recall -> " + m.getCurrentValue());
        m.memoryClear();
        m.memoryRecall();
        System.out.println("final memory recall -> " + m.getCurrentValue());
    }
}