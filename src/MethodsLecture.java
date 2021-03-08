import java.util.Locale;
import java.util.Scanner;

public class MethodsLecture {


  public static void main(String[] args) {


//        System.out.println(getGreeting()); // we call get greeting because it RETURNS the greeting
//
//        printGreeting(); // we decided to do the print action in another method!
//
//        //Mini Exercise #1
//        //multiplyUserInputs();
//
//        //Mini Exercise #2
//        String name1 = "Casey";
//        String name2 = "Justin";
//        String name3 = "Ry";

//        printNames(name1);
//        printNames(name1, name2);
    //printNames(name1, name2, name3);


    String greeting = getProperGreeting();
    System.out.println(greeting);
  }

  // ============== Method Definitions ===============


  // *** Static vs Instance ***
  // Static Method
  public static int doTheMathStatic() {
    return 1 + 2;
  }

  // Instance Method
  public int doTheMathInstance() {
    return 1 + 2;
  }


  // *** Returning vs Void ***

  // A returning method will give back a specific data/object

  public static String getGreeting() {
    return "Hai!";
  }

  // A void method will only execute code inside, without a returning object
  // You use them when you just want to perform an action (let's say: printing to the console)
  public static void printGreeting() {
    System.out.println(getGreeting()); //oOoOoOo we called a returning method in here!
  }


  // *** Access Modifiers ***

  // Public - available to any class that can access this class
  public static String getNameString(String name) {

    if (name == null || name.equals("")) {
      return "No name provided";
    } else {
      return getFormattedName(name, "My name is: ");
    }

  }

  // Private - only available to use in this class
  // Often we use private methods for doing work internally to a class
  // When there is no need for this to be exposed to another class
  private static String getFormattedName(String name, String greeting) {
    return greeting + name.toUpperCase();
  }


  // *** Parameters ***

  // Above, notice that we passed in a parameter called 'name'
  // Unlike in Javascript, we must declare the data/object type of that param
  // If you don't know the type of object until runtime,
  // you can pass in 'Object' as the type, but be careful as that can cause other issues if you
  // haven't accounted for the fact that the Object can be anything!


  // ============ Mini Exercise #1 =============
  /* TODO:
   *   -Write a public static method which returns an integer
   *   -The method should take in *two parameters* and *return* the product of multiplying them
   *   -Print the output to the console by calling the method, passing in params, and logging its output
   *   BONUS: Use the Scanner class to get the numbers from the user input
   * */


  public static int multiply(int a, int b) {
    return a * b;
  }

  public static void multiplyUserInputs() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter two numbers to multiply: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.printf("Your numbers are: %s and %s \n\nPress return to continue\n", num1, num2);

    sc.nextLine();
    sc.nextLine();

    System.out.printf("The output is: %s", multiply(num1, num2));

  }


  // ============== Method Overloading ===============


  // Overloading can be very useful if we want to use the same functionality but perhaps need
  // differing numbers of parameters depending on the use case

  // Take the below examples:
  public static int doMath() { // maybe we just want to add
    return 1 + 1;
  }

  public static int doMath(int a) { // maybe we need to pass an int to the equation
    return a + (1 + 1);
  }

  public static int doMath(int a, int b) { // or pass a couple of ints to the equation
    return a + b + (1 + 1);
  }

  // Remember that overloading only deals with parameters
  // Changing the return type (int -> void) will still throw an error because we already
  // defined a no argument doMath() above
//    public static void doMath(){
//        System.out.println(1 + 1);
//    }


  // ============ Mini Exercise #2 =============

  /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
   *   -Call each of the methods, passing in the names for each
   *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
   *   BONUS: Use the Scanner class to get the names from user input
   *  */


  public static void printNames(String name) {
    System.out.printf("Hello, %s", name);
  }

  public static void printNames(String name1, String name2) {
    System.out.printf("Hello, %s and %s", name1, name2);
  }

  public static void printNames(String name1, String name2, String name3) {
    System.out.printf("Hello, %s, %s, and %s", name1, name2, name3);
  }


  // ============== Recursion ===============


  // Google search 'recursion' ;)

  public static void count(int n) {
    if (n <= 0) {
      System.out.println("All done!");
      return;
    }
    System.out.println(n);
    count(n - 1);
  }


  // Getting exponential outputs

    /*
        In math:
        3 to the 3rd power:
        3 * 3 * 3


     */


  public static long getPower(int base, int exponent) {
    long result = 1;
    for (int i = 1; i <= exponent; i++) {
      System.out.println(result);
      result = result * base;
    }
    return result;
  }


//    public static long getPower(int base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        } else if (exponent == 1) {
//            return base;
//        } else if (exponent == 2) {
//            return base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }


  // ============== Responsible Method Use ===============

  // Pro Tips: Write small, simple methods that do ONE thing
  // Use those simple methods combined to do more complex things!
  // This is very micro intro to a practice called orchestration

  // If changing one thing about your method requires drastic refactoring,
  // then you may need to break up the method into simpler components

  // The point of the below line is to show you BAD method-writing practices
  // This method is called getProperGreeting()... but ask yourself: Is that really what this is doing?
  // And if it's not what the method is doing, what IS it doing?
  // If you can't easily define that, then this method is probably doing TOO much and just be broken apart somehow
  // Notice areas where code is repeated?
  // That violates what is called DRY (Don't Repeat Yourself) and the code is a good candidate for extracting into a separate method to be reused!
  // Notice also when you run that the code is so complicated that the execution is even full of bugs! But good luck trying to fix the bugs without trashing the whole thing!

/*
        TODO: Try turning this method into a good set of methods that share functionality.
         -The methods should be short, perform a minimal set of tasks, and have names that CLEARLY let us know what the methods do.
         -Hint: the orchestration method (the one that wraps all the others) could maybe be called: havePhoneConversation()
         -Feel free to adjust the logic to the way you like. The point is you should have a phone conversation with automated responses based (sort of) on what the user inputs
         -Maybe use recursion to know when to end the conversation?
 */


  public static String getProperGreeting() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Hello, who is this?");

    String response = sc.nextLine().toLowerCase();


    if (response == null || response.equals("")) {
      String greeting = "I'm not sure you are a person I should be talking to!";
      System.out.println(greeting);
      return greeting;
    } else if (response.equals("mom")) {
      String greeting = "Hey Mom! Of course I got your card and it was lovely!";
      System.out.println(greeting);
      return greeting;
    } else if (response.equals("bestie")) {
      String greeting = "UwU I miss you so much! When are you coming back to town?";
      System.out.println(greeting);
      return greeting;
    }

    System.out.println("Well, I need to go now!");

    response = sc.nextLine();

    if (response == null || response.equals("")) {
      String endingPhrase = "* hangs up *";
      System.out.println(endingPhrase);
      return endingPhrase;
    } else if (response.equals("See you later!")) {
      String endingPhrase = "Bye bye!";
      System.out.println(endingPhrase);
      return endingPhrase;
    } else if (response.equals("Have a great day, see you soon!")) {
      String nextPhrase = "You as well!";
      System.out.println(nextPhrase);

      response = sc.nextLine();

      if (response == null || response.equals("")) {
        String confusion = "I think I lost you...";
        System.out.println(confusion);
        return confusion;
      } else {
        String conclusion = "Hey! I actually need to get going!";
        System.out.println(conclusion);

        response = sc.nextLine();

        if (response == null || response.equals("")) {
          String confusion = "I think I lost you....";
          System.out.println(confusion);
          return confusion;
        }

        return conclusion;
      }

    }
    return "***End of Call***";
  }

}
