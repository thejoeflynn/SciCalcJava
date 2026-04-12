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
            String operation = Console.getStringInput("Enter an operation. For a list of operations, type 'help' or 'exit' to quit:");
            
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
                    ScientificCalculator sinCalc = new ScientificCalculator();
                    sinCalc.sin();
                    break;
                case "cos":
                    ScientificCalculator cosCalc = new ScientificCalculator();
                    cosCalc.cos();
                    break;
                case "tan":
                    ScientificCalculator tanCalc = new ScientificCalculator();
                    tanCalc.tan();
                    break;
                case "sin inverse":
                    ScientificCalculator sinInverseCalc = new ScientificCalculator();
                    sinInverseCalc.sinInverse();
                    break;
                case "cos inverse":
                    ScientificCalculator cosInverseCalc = new ScientificCalculator();
                    cosInverseCalc.cosInverse();
                    break;
                case "tan inverse":
                    ScientificCalculator tanInverseCalc = new ScientificCalculator();
                    tanInverseCalc.tanInverse();
                    break;
                case "log":
                    ScientificCalculator logCalc = new ScientificCalculator();
                    logCalc.log();
                    break;
                case "percentage":
                    ScientificCalculator percentCalc = new ScientificCalculator();
                    percentCalc.percentage();
                    break;
                case "absolute value":
                    ScientificCalculator absCalc = new ScientificCalculator();
                    absCalc.abs();
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
