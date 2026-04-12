package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        println(prompt);
        return scanner.nextLine();
    }

    public static Double getDoubleInput(String prompt) {
        println(prompt);
        try {
            String userInput = scanner.nextLine();
            return Double.parseDouble(userInput);
        } catch (Exception e) {
            println("Invalid input. Please enter a valid number.");
            return getDoubleInput(prompt);
        }
    }

    public static Integer getIntegerInput(String prompt) {
        println(prompt);
        try {
            String userInput = scanner.nextLine();
            return Integer.parseInt(userInput);
        } catch (Exception e) {
            println("Invalid input. Please enter a valid number.");
            return getIntegerInput(prompt);
        }
    }
}
