import java.util.Scanner;

public class MethodsExercises {
  public static void main(String[] args) {
    add(1, 2);
    subtract(4, 3);
    multiply(5, 6);
    divide(8, 2);
    modulous(15, 3);
    getInteger(1, 100);
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
    System.out.println("Enter a input between " + min + " & " + max);
    int input = sc.nextInt();
    if (input < min || input > max) {
      //System.out.println("That is not a number between 1 & 100, please try again.");  dont hard code the numbers
      System.out.println("That is not a number between " + min + " & " + max + " please try again.");
      return getInteger(min, max);
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


