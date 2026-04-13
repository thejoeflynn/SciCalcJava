package com.zipcodewilmington.scientificcalculator;

public class SelfTest {
    public static void main(String[] args) {
        Memory m = new Memory();
        m.setDisplay(5.0);
        m.memoryStore();
        m.setDisplay(0.0);
        m.memoryRecall();
        System.out.println("After store/recall: " + m.getDisplay()); // expect 5.0

        m.setDisplay(2.0);
        m.memoryAdd(3.0);
        m.memoryRecall();
        System.out.println("After memoryAdd(3) and recall: " + m.getDisplay()); // expect 5.0

        m.setDisplay(10.0);
        m.divide(0); // error
        m.memoryRecall();
        System.out.println("After div0 then recall (should remain Err): " + m.getDisplay());

        m.setDisplay(1.0);
        m.sin();
        System.out.println("sin(1) -> " + m.getDisplay());
    }
}