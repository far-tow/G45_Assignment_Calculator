package com.fartow;

public class Calculator {

    public static void displayMenu() {
        System.out.println("+ - Addition");
        System.out.println("- - Subtraction");
        System.out.println("* - Multiplication");
        System.out.println("/ - Division");
    }

    public static void displayWelcomeMassage() {
        System.out.println("######################");
        System.out.println(" Welcome to Farhad's Calculator!");
        System.out.println("######################");
    }

    public static double addition(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double division(double number1, double number2) {
        return number1 / number2;
    }

}
