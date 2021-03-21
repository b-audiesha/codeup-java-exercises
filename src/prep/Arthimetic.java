package prep;

public class Arthimetic {

  public static int squared(int num) {
    return num * num;
  }

  public static int sum(int num, int num2) {
    return num + num2;
  }

  public static int difference(int num, int num2) {
    return num - num2;
  }

  public static double product(double num, double num2) {
    return num * num2;
  }
  public static double average(int[] array) {
    int sum = 0;
    //Advanced for loop
    for (int i : array) sum += i;
    return ((double)sum) / array.length;
}}


//Arthimetic.java - all static methods inside
//square - takes in an int argument, returns the square of that number as an int
//sum - takes in two numeric (your choice of type) arguments, returns the sum of both
//difference - takes in two numeric (your choice of type) arguments, returns the difference between the two
//product - takes in two numeric (your choice of type) arguments, returns the product (multiply)
//average - takes in a numeric array as an argument, returns the average of that array
//App.java
//has a main() method which is where you will test all of the methods of Arithmetic

