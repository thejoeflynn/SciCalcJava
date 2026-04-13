package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Memory;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    public static void main(String[] args) {
         System.out.println("Running tests for ACJ Calculator...");

        new ACJTests().runAllTests();

         System.out.println("All tests passed!");
    }
}
