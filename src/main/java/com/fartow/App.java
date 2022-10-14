package com.fartow;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator.displayWelcomeMassage();
        boolean condition = true;
        while (condition) {

            //Calculator.displayWelcomeMassage();
            Calculator.displayMenu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please choose an action:");
            char oprationType = sc.next().charAt(0);
            if (oprationType == '+' || oprationType == '-' || oprationType == '*' || oprationType == '/') {

                double number1 = Calculator.getInputNumber();
                double number2 = Calculator.getInputNumber();
                double result = 0;
                switch (oprationType) {
                    case '+':
                        result = Calculator.addition(number1, number2);
                        break;

                    case '-':
                        result = Calculator.subtraction(number1, number2);
                        break;

                    case '*':
                        result = Calculator.multiplication(number1, number2);
                        break;

                    case '/':
                        result = Calculator.division(number1, number2);
                        break;

                    //default:
                     //   System.out.println("Operation type is not valid!");

                }

                System.out.println("Result: " + result);

            } else {
                System.out.println("Operation type is not valid!");

            }

            System.out.println("Do you want to continue? Yes / No");
            String continueOperation = sc.next();
            if (continueOperation.equalsIgnoreCase("No")) {
                condition = false;
                System.out.println("Have a nice day!");
            }


        }


    }


}
