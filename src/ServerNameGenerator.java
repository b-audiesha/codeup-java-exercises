import java.util.Random;

public class ServerNameGenerator {
  public static String[] adjectives ={"magenta",
    "great",
    "descriptive",
  "  magical",
    "luxuriant",
    "slimy",
   " pushy",
   " classy",
    "abounding",
    "colossal"};
  public static String[] nouns ={"kettle",
    "girls",
    "group",
    "  impulse",
    "cherry",
    "drink",
    " thumb",
    " quiver",
    " activity",
    " passenger"};



  public static void main(String[]args) {
    System.out.println("Here is your server name: ");
    System.out.println(getWord(adjectives) + "-" + getWord(nouns));
  }


  public static String getWord(String[] choices) {
    Random random = new Random();
    int randomNumber = random.nextInt(choices.length);
    return choices[randomNumber];
  }
}
