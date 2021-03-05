import java.util.Scanner;

public class Bob {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("What do you want to bother your kid with today? ");
    String momSays = sc.nextLine().trim();

    if (momSays.endsWith("!")) {
      System.out.println("Whoa, how bout you chill out!");
    } else if (momSays.endsWith("?")) {
      System.out.println("Sure...");
    } else if (momSays.equals("")) {
      System.out.println("Fine Mom, Be that way!");
    } else {
      System.out.println("Whatever. Ignore me then.");
    }

  }
}
