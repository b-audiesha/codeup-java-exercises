import java.util.Scanner;

import static java.lang.System.*;

public class ConsoleExercises {
  public static void main(String[] args) {
    double pi = 3.14159;
    out.format("The value of pi is approximately " + "%.2f%n", pi);

    //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int newNum = sc.nextInt();
    System.out.println(newNum);


    System.out.print("Please enter your three random words: ");
    String firstWord = sc.next();
    String secondWord = sc.next();
    String thirdWord = sc.next();

    System.out.println(firstWord);
    System.out.println(secondWord);
    System.out.println(thirdWord);
// if you enter less than three words it gives you nothing  until you enter another word
// Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
System.out.println("Please enter a sentence:");
String sentence = sc.next();
System.out.println(sentence);
// doesnt display all words
//        // Rewrite the above example using the .nextLine method.
//
System.out.println("Please enter a sentence:");
String sentences = sc.nextLine();
System.out.println(sentences);
//


    // Calculate the perimeter and area of Codeup's classrooms.
    //Prompt the user to enter values of length and width of a classroom at Codeup.
    //
    //Use the nextLine method to get user input and parse the resulting string to a numeric type.
    //
    //Assume that the rooms are perfect rectangles.
    //Assume that the user will enter valid numeric data for length and width.
    //Display the area and perimeter of that classroom.
    //
    //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
    out.println("Enter the Length: ");
    String lengthInput = sc.nextLine();
    System.out.println("Enter the width: ");
    String widthInput = sc.nextLine();
    double length = Double.parseDouble(lengthInput);
    double width = Double.parseDouble(widthInput);
    out.println("The area is: " + (length * width) + ".");
    out.println("The perimeter is: " + (length * 2 + width * 2) + ".");
  }
}
