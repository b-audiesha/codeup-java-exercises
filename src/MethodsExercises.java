import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
  public static void main(String[] args) {
    add(1, 2);
    subtract(4, 3);
    multiply(5, 6);
    divide(8, 2);
    modulous(15, 3);
  }

  public static int add(int number, int number2) {
    System.out.println(number + number2);
    return number + number2;
  }

  public static int subtract(int number, int number2) {
    System.out.println(number - number2);
    return number - number2;
  }

  public static int multiply(int number, int number2) {
    System.out.println(number * number2);
    return number * number2;
  }

  public static int divide(int number, int number2) {
    System.out.println(number / number2);
    return number / number2;
  }

  public static long modulous(long number, long number2) {
    System.out.println(number % number2);
    return number % number2;
  }

  public static int getInteger(int min, int  max) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a input between" + 1 + "&" + 10);
    int input = sc.nextInt();
    if (input < 1 || input > 10) {
      System.out.println("That is not a number between 1 & 10, please try again.");
    } else
      System.out.println("That is a valid entry,thank you!");
    return input;
  }
}
//Basic Arithmetic
//
//Create four separate methods. Each will perform an arithmetic operation:
//
//Addition
//Subtraction
//Multiplication
//Division
//Each function needs to take two parameters/arguments so that the operation can be performed.
//
//Test your methods and verify the output.
//
//Add a modulus method that finds the modulus of two numbers.
  //================ 2) ================//




  //Create a method that validates that user input is in a certain range
  //
  //The method signature should look like this:
  //
  //Copied to clipboard
  //public static int getInteger(int min, int max);


