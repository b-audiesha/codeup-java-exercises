import java.util.Formatter;
import java.util.Scanner;

//For all of the following exercises, create a new class named ControlFlowExercises
// with a main method. After each exercise, commit your changes,
// then replace your code in the main method with the next exercise.
public class ControlFlowExercises {
  public static void main(String[] args) {

    int i = 5; //Create an integer variable i with a value of 5.
    while (i <= 15) { //Create a while loop that runs so long as i is less than or equal to 15
      // System.out.print(i + " ");  //Each loop iteration, output the current value of i, then increment i by one.
      i++;
    }
// output 5 6 7 8 9 10 11 12 13 14 15

    //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
    int counter = 0;
    do {
      System.out.println(counter);
      counter += 2; //count by 2's
    } while (counter <= 100); // and ending at 100

    int counterTwo = 100;
    do {
      System.out.println(counterTwo);
      counterTwo -= 5; //Alter your loop to count backwards by 5's
    } while (counterTwo >= -10); //from 100 to -10.
    // Create a do-while loop that starts at 2, and displays
    // the number squared on each line while the number is less than 1,000,000.
    long squared = 2; //starts at 2
    do {
      System.out.println(squared);
      squared = squared * squared; //the number squared
    } while (squared < 1000000); //is less than 1,000,000

    //Refactor the previous two exercises to use a for loop instead

    for (int x = 100; x >= -10; x -= 5) {
      System.out.println(x);
    }
    for (long x = 2; x < 1000000; x = x * x) {
      System.out.println(x);
    }
    //Write a program that prints the numbers from 1 to 100.

    for (int x = 1; x <= 100; x++) {
      if (x % 3 == 0) {
        System.out.println("Fizz");
      } else if (x % 5 == 0) {
        System.out.println("Buzz");
      } else if (x % 15 == 0) {
        System.out.println("FizzBuzz");
      } else System.out.println(x);
    }
  }
}



