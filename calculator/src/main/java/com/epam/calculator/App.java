package com.epam.calculator;

import java.util.Scanner;

public class App 
{
	double add(double a,double b) {
        return a+b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double multiply(double a,double b) {
        return a*b;
    }
    
    public static void main( String[] args )
    {
    	App calculator=new App();
    	Scanner scanner=new Scanner(System.in);
    	int choice = 0;
        while (choice < 4) {
            System.out.println("Choose the Operation");
            System.out.println(
                    "1.Addition of Numbers 2 or More\n" +
                            "2.Subtraction of Two Numbers\n" +
                            "3.Division of Two Numbers\n" +
                            "4.Multiplication of 2 or more numbers\n" +
                            "Enter Your Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Space Separated Values");
                    System.out.println("Result: " + calculator.add(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 2:
                    System.out.println("Enter two Values");
                    System.out.println("Result: " + calculator.subtract(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 3:
                    System.out.println("Enter two Values");
                    System.out.println("Result: " + calculator.divide(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 4:
                    System.out.println("Enter Space Separated Values");
                    System.out.println("Result: " + calculator.multiply(scanner.nextDouble(), scanner.nextDouble()));
                    break;
            }
        }
        scanner.close();
    }
}
