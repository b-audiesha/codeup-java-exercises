import java.util.Scanner;

import static java.lang.System.*;

public class ConsoleExercises {
  public static void main(String[ ] args) {
    double pi = 3.14159;
   out.format( "The value of pi is approximately " + "%.2f%n", pi);

    //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
    Scanner num = new Scanner(System.in);
    System.out.print("Please enter s number: ");
    int newNum = num.nextInt();
    System.out.println(newNum);

    Scanner words = new Scanner(System.in);
   System.out.print("Please enter your three random words: ");
    String firstWord = words.next();
    String secondWord = words.next();
    String thirdWord = words.next();

    System.out.println(firstWord);
    System.out.println(secondWord);
    System.out.println(thirdWord);
// if you enter less than three words it gives you nothing  until you enter another word
  }
}
