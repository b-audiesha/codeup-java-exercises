public class HighLow {
  public static void main(String[] args) {
    System.out.println(checkGuess(60,60));
  }

  public static String checkGuess(int guess, int targetNum) {
    if (guess == targetNum) {
      return "You guessed the correct number!";
    } else if (guess > targetNum) {
      return "Guess a lower number please!";
    } else if (guess < targetNum) {
      return "Higher please!";
    }
  return"Yeaaaah,idk";
}




}
