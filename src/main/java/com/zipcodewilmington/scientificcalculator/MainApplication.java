package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");

        Calculator myCalculator = new Calculator();
        boolean isRunning = true;
        Console.println("Current value: %s", myCalculator.getDisplay());

        while (isRunning) {
            String operation = Console.getStringInput("Enter an operation (add, subtract, multiply, divide) or 'exit' to quit:");
            
            if (isRunning) {
                Console.println("Current value: %s", myCalculator.getDisplay());

            switch (operation.toLowerCase()) {
                case "add":
                    Double addValue = Console.getDoubleInput("Enter a number to add:");
                    myCalculator.add(addValue);
                    break;
                case "subtract":
                    Double subtractValue = Console.getDoubleInput("Enter a number to subtract:");
                    myCalculator.subtract(subtractValue);
                    break;
                case "multiply":
                    Double multiplyValue = Console.getDoubleInput("Enter a number to multiply:");
                    myCalculator.multiply(multiplyValue);
                    break;
                case "divide":
                    Double divideValue = Console.getDoubleInput("Enter a number to divide:");
                    myCalculator.divide(divideValue);
                    break;
                case "clear":
                    myCalculator.clearDisplay();
                    break;
                case "change":
                    Double newValue = Console.getDoubleInput("Enter a new value:");
                    myCalculator.changeNumber(newValue);
                    break;
                case "sqrt":
                    myCalculator.squareRoot();
                    break;
                case "reciprocal":
                    myCalculator.inverse();
                    break;
                case "exit":
                    String confirm = Console.getStringInput("Do you want to exit? (y/n)");
                    if (confirm.equalsIgnoreCase("y")) {   
                        isRunning = false;
                        Console.println("Goodbye!, Thanks for the ACJ Calculator!");
                    }
                    break;    
                default:
                    Console.println("Invalid operation. Please try again.");
            }
            }

        }
    }
}
