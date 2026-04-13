package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");

        Memory myCalculator = new Memory();
        boolean isRunning = true;
        Console.println("Current value: %s", myCalculator.getDisplay());

        while (isRunning) {
            String operation = Console.getStringInput("Enter an operation. For a list of operations, type 'help'. To exit, type 'exit'.");
            
            if (isRunning) {
                Console.println("Current value: %s", myCalculator.getDisplay());

            switch (operation.toLowerCase()) {
                case "number":
                    Double newValue = Console.getDoubleInput("Enter a new value:");
                    myCalculator.changeNumber(newValue);
                    break;
                case "help":
                    Console.println("Available operations:");
                    Console.println("- number: Change the current value to a new number");
                    Console.println("- memory recall: Recall the value stored in memory");
                    Console.println("- memory clear: Clear the value stored in memory");
                    Console.println("- memory store: Store the current value in memory");
                    Console.println("- add: Add a number to the current value");
                    Console.println("- subtract: Subtract a number from the current value");
                    Console.println("- multiply: Multiply the current value by a number");
                    Console.println("- divide: Divide the current value by a number");
                    Console.println("- clear: Clear the display and reset to 0");
                    Console.println("- squareroot: Calculate the square root of the current value");
                    Console.println("- square: Calculate the square of the current value");
                    Console.println("- invert: Invert the sign of the current value");
                    Console.println("- reciprocal: Calculate the reciprocal of the current value");
                    Console.println("- sin: Calculate the sine of the current value");
                    Console.println("- cos: Calculate the cosine of the current value");
                    Console.println("- tan: Calculate the tangent of the current value");
                    Console.println("- sin inverse: Calculate the arcsine of the current value");
                    Console.println("- cos inverse: Calculate the arccosine of the current value");
                    Console.println("- tan inverse: Calculate the arctangent of the current value");
                    Console.println("- log: Calculate the base-10 logarithm of the current value");
                    Console.println("- percentage: Calculate the percentage of the current value");
                    Console.println("- absolute value: Calculate the absolute value of the current value");
                    Console.println("- exit: Exit the calculator");
                    break;
                case "clear":
                    myCalculator.clearDisplay();
                    break;
                case "memory recall":
                    myCalculator.memoryRecall();
                    break; 
                case "memory clear":
                    myCalculator.memoryClear();
                    break;
                case "memory store":
                    myCalculator.memoryStore();
                    break;
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
                case "squareroot":
                    myCalculator.squareRoot();
                    break;
                case "square":
                    myCalculator.square();
                    break;
                case "invert":
                    myCalculator.invertSign();
                    break;
                case "reciprocal":
                    myCalculator.inverse();
                    break;
                case "sin":
                    myCalculator.sin();
                    break;
                case "cos":
                    myCalculator.cos();
                    break;
                case "tan":
                    myCalculator.tan();
                    break;
                case "sin inverse":
                    myCalculator.sinInverse();
                    break;
                case "cos inverse":
                    myCalculator.cosInverse();
                    break;
                case "tan inverse":
                    myCalculator.tanInverse();
                    break;
                case "log":
                    myCalculator.log();
                    break;
                case "percentage":
                    myCalculator.percentage();
                    break;
                case "absolute value":
                    myCalculator.abs();
                    break;
                case "exit":
                    String confirm = Console.getStringInput("Do you want to exit? (y/n)");
                    if (confirm.equalsIgnoreCase("y")) {   
                        isRunning = false;
                        Console.println("Thanks for using the ACJ Calculator!");
                    }
                    break;    
                default:
                    Console.println("Invalid operation. Please try again.");
            }
            Console.println("Current value: %s", myCalculator.getDisplay());
            }

        }
    }
}
