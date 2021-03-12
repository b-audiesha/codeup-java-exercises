package util;
import java.util.Scanner;

public class Input {
  private final Scanner scanner;

  public Input(){
    this.scanner = new Scanner(System.in);
  }

  public String getString(){
    return this.scanner.nextLine();
  }

  public String getString(String prompt){
    System.out.println(prompt);
    return this.scanner.nextLine();
  }
  public boolean yesNo(){
    System.out.println("Would you like to continue? Type | Y or N |");
    String input = this.scanner.nextLine();
    return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
  }

  public boolean yesNo(String prompt){
    System.out.println(prompt);
    String input = this.scanner.nextLine();
    return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
  }

  public int getInt(int min,int max){
    while (true) {
      System.out.printf("Please enter an number between %d and %d", min, max);
      int num;
      try {
        String input = scanner.nextLine();
        num = Integer.parseInt(input);

      } catch(Exception e) {
        System.out.println("You must enter an number! ");
        return getInt(min, max);
      }
      if (num >= min && num <= max) {
        return num;
      }
    }
  }

  public int getInt(){
    System.out.println("Choose a number");
    String input = scanner.nextLine();
    int number = Integer.parseInt(input);
    return number;
  }

  public int getInt(String prompt) {
    System.out.println(prompt);
    String input = scanner.nextLine();
    int number;
    try {
      number =Integer.parseInt(input);;
    }catch(NumberFormatException nfex) {
      System.out.println("You must enter an number.");
      return getInt(prompt);
    }

    return number;
  }
  public double getDouble(double min,double max){
    while (true) {
      System.out.printf("Please enter a number between %f and %f", min, max);

      String input = scanner.nextLine();
      double number = Double.parseDouble(input);
      if (number >= min && number <= max)
        return number;
    }
  }

  public double getDouble(){
    System.out.println("Please enter a number");
    String input = scanner.nextLine();
    return Double.parseDouble(input);
  }
}

//Create a package inside of src named util. Inside of util, create a
// class named Input that has a private property named scanner.
// When an instance of this object is created, the scanner property
// should be set to a new instance of the Scanner class.
// The class should have the following methods, all of which return command line
// input from the user:
