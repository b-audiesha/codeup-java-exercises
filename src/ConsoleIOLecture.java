import java.util.Scanner;

public class ConsoleIOLecture {
  public static void main(String[ ] args) {

    // ================================== print() and println()

    // this : //print line goes automatically to the next line
    System.out.println("here");
System.out.println("there");

    // is equivalent to this:
System.out.print("here\n");
System.out.print("there\n");

    // without the newline characters, print outputs this: // prints "herethere"
//System.out.print("here");
//System.out.print("there");

    // to concatenate, just like JS:
 System.out.println("Hello" + " " + "World");

    // ================================== printf() / .format()

    // Print a formatted string using the following... printf(formatString, data)

    // same output as print():
// System.out.printf("Hello");
// System.out.printf("World!");

    // creating a string variable:
//String bigBall = "World";
//System.out.printf("Hello %s", bigBall); // pretty similar to ${} in e6 template strings, this prints Hello World
//System.out.printf("Hello %S", bigBall); // all caps

//    String firstN = "Audiesha";
//    String secondN = "Brattin";
//
//    System.out.printf("%s %s", firstN ,secondN);
    // multiple variables:
//            int three = 3;
//            String typeOfPetGroup = "cats";
//            System.out.printf("I have %d %s.", three, typeOfPetGroup);

    // when working with a whole number use %d when your working with a string continue to use %s.

    // currency:
//int currencyPennies = 1431;
//System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);
 // % is a place holder

//    int age = 23;
//    String name = "Fred";
//    String state = "Texas";
//System.out.printf("%s is from %s and is %d years old",name,state,age );
// Fred is from Texas and is 23 years old.




    // ================================== USER INPUT
//enter something inside of the console and it echos back.
//Scanner sc = new Scanner(System.in);
//String userInput = sc.next();
//System.out.println(userInput);

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Please enter your first name!");
//    String usersInput = sc.next();
//    System.out.println(usersInput);

//TODO: use the scanner to take in the name of the month you were born and print it back out
            // remember to first prompt the user for the input

Scanner sc = new Scanner(System.in);
System.out.println("Please enter the month you were born in!");
String month = sc.next();
System.out.println("You were born in " + month);

    // .next() captures each input separated by a string:
            System.out.print("Please enter your first, middle, and last name: ");
            String firstName = sc.next();
            String lastName = sc.next();
            String what = sc.next();

            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(what);

    // .nextInt() captures the first valid int value:
System.out.print("Please enter your age: ");
        int age = sc.nextInt();
       System.out.println(age);

    // .nextLine():
 System.out.print("In the end we're all just chalk lines on the concrete \n" +
   "Drawn only to be washed away \n" +
   "For the time that I've been given \n" +
   "I am what I am:  ");
 String quote = sc.nextLine();
System.out.println(quote);
    System.out.println("Five Finger Death Punch");
    // Quirk of using next() then nextLine()...
    // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
    // https://coderanch.com/wiki/676482/Scanner-nextLine-gotcha
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Please enter your favorite number: ");
//            int num = sc.nextInt();
//            System.out.println(num);
//            System.out.print("Please enter your favorite words: ");
//            String words = sc.nextLine();
//            System.out.println(words);

    /* TODO: use the scanner to take in your birthday as an integer and then name of the month you were born and print it back out
            - remember to first prompt the user for the birthday day of the month and store as an integer
            - next take in name of the month with .nextLine()
            - print out the result
            - use a fix to prevent the month name input from being skipped
         */

  }

}
