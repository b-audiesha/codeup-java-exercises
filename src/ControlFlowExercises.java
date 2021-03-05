import java.util.Scanner;


//For all of the following exercises, create a new class named ControlFlowExercises
// with a main method. After each exercise, commit your changes,
// then replace your code in the main method with the next exercise.
public class ControlFlowExercises {
  public static void main(String[] args) {

    int counter1 = 5; //Create an integer variable i with a value of 5. used counter1 instead of i because i was repeated
    while (counter1 <= 15) { //Create a while loop that runs so long as i is less than or equal to 15
      System.out.print(counter1 + "  ");  //Each loop iteration, output the current value of i, then increment i by one. The spaces make it move vertically.
      counter1++;
    }
// output 5 6 7 8 9 10 11 12 13 14 15

    //Create a do-while loop that will count by 2's starting
    // with 0 and ending at 100. Follow each number with a new line.
    int counter = 0; //used counter instead of i because i was repeated
    do {
      System.out.println(counter); //"println prints to new line
      counter += 2; //count by 2's
    } while (counter <= 100); // and ending at 100

    int counterTwo = 100;
    do {
      System.out.println(counterTwo); //"println prints to new line
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


    for (int x = 1; x <= 100; x++) {  //Write a program that prints the numbers from 1 to 100.
      if (x % 15 == 0) {
        System.out.println("FizzBuzz"); //For numbers which are multiples of both three and five: print “FizzBuzz”.
      } else if (x % 5 == 0) {
        System.out.println("Buzz"); //For the multiples of five: print “Buzz”.
      }
      if (x % 3 == 0) {
        System.out.println("Fizz"); //For multiples of three: print “Fizz” instead of the number.
      } else System.out.println(x);
    }


    String answer;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Please Enter a Number?"); //Prompt the user to enter an integer.
      int userNumber = sc.nextInt();
      System.out.println("Here is your table!");
      System.out.println("number | squared | cubed"); //Display a table of squares and cubes from 1 to the value entered.
      System.out.println("------- | ------- | -------");
      for (int i = 1; i <= userNumber; i += 1) {
        System.out.printf("%-6d | %-7d | %d \n", i, i * i, i * i * i);
      }
      System.out.println();
      System.out.println("Would you like to continue? (yes/no)"); //Ask if the user wants to continue.
      answer = sc.next();
    } while (answer.equalsIgnoreCase("yes"));
    //The String equalsIgnoreCase() method compares the two given strings on the basis of
    // content of the string irrespective of case of the string.
    // It is like equals() method but doesn't check case. If any character
    // is not matched, it returns false otherwise it returns true.


    Scanner gradeScanner = new Scanner(System.in);
    System.out.println("Are you ready to know your grade? Yes/No");
    String input = gradeScanner.next();
    boolean question = input.equalsIgnoreCase("yes");
    while (question == true) {
      System.out.println("Please Enter a a numerical grade from 0 to 100?");
      int enteredGrade = gradeScanner.nextInt();
      if (enteredGrade > 94) {
        System.out.println("A +");
        System.out.println("Would you like to enter another grade? (Yes/No)");
        input = gradeScanner.next();
        question = input.equalsIgnoreCase("yes");
      } else if (enteredGrade < 95 && enteredGrade > 89) {
        System.out.println("A");
        System.out.println("Would you like to enter another grade? (Yes/No)");
        input = gradeScanner.next();
        question = input.equalsIgnoreCase("yes");
      } else if (enteredGrade < 90 && enteredGrade > 84) {
        System.out.println("B +");
        System.out.println("Would you like to enter another grade? (Yes/No)");
        input = gradeScanner.next();
        question = input.equalsIgnoreCase("yes");
      } else if (enteredGrade < 85 && enteredGrade > 79) {
        System.out.println("B");
        System.out.println("Would you like to enter another grade? (Yes/No)");
        input = gradeScanner.next();
        question = input.equalsIgnoreCase("yes");
      } else if (enteredGrade < 80 && enteredGrade > 73) {
        System.out.println("C +");
        System.out.println("Would you like to enter another grade? (Yes/No)");
        input = gradeScanner.next();
        question = input.equalsIgnoreCase("yes");
      } else if (enteredGrade < 74 && enteredGrade > 69) {
        System.out.println("C");
        System.out.println("Would you like to enter another grade? (Yes/No)");
        input = gradeScanner.next();
        question = input.equalsIgnoreCase("yes");
      } else if (enteredGrade < 70 && enteredGrade > 60) {
        System.out.println("D");
        System.out.println("Would you like to enter another grade? (Yes/No)");
        input = gradeScanner.next();
        question = input.equalsIgnoreCase("yes");
      } else {
        System.out.println("Do you want to tell your parents ? \n" + "Or should I ?  \n" + "Because honestly,this is getting really old.");
//        System.out.println("Would you like to enter another grade? (Yes/No)");
        input = gradeScanner.next();
        question = input.equalsIgnoreCase("yes");
      }
    }
  }
}



