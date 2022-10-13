package com.fartow;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator.displayWelcomeMassage();
        boolean condition = true;
        while (condition){

            //Calculator.displayWelcomeMassage();
            Calculator.displayMenu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please choose an action:");
            char oprationType = sc.next().charAt(0);

            System.out.println("Enter the first number: ");
            double number1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            double number2 = sc.nextInt();
            //double result = Calculator.addition(number1, number2);

            //switch ()
            switch (oprationType) {
                case '+':
                    double result = Calculator.addition(number1, number2);
                    System.out.println(number1 + " " + "+" + " " + number2 + " " + "=" + " " + result);
                    break;

                case '-':
                    System.out.print(number1 + " " + "-" + " " + number2 + " " + "=" + " ");
                    System.out.println(Calculator.subtraction(number1, number2));
                    break;

                case '*':
                    System.out.print(number1 + " " + "*" + " " + number2 + " " + "=" + " ");
                    System.out.println(Calculator.multiplication(number1, number2));
                    break;

                case '/':
                    System.out.print(number1 + " " + "/" + " " + number2 + " " + "=" + " ");
                    System.out.println(Calculator.division(number1, number2));
                    break;

                default:
                    System.out.println("Operation type is not valid!");

            }
            System.out.println("Do you want to continue? Yes / No");
            String continueOperation = sc.next();
            if (continueOperation.equalsIgnoreCase("No")){
                condition = false;
                System.out.println("Have a nice day!");
            }


        }



    }


}
