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
  public static int multiply(int number,int number2) {
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
}
