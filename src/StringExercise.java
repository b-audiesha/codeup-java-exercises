public class StringExercise {
  public static void main(String[] args) {
    String thought = "We don't need no education,We don't need no thought control";
    String part1 = thought.substring(0, thought.indexOf(","));
    String part2 = thought.substring(part1.length() + 1);
    System.out.println(part1);
    System.out.println(part2);
// or this does the same thing in less lines
    String thoughts = "We don't need no education\n" + "We don't need no thought control";
    System.out.println(thoughts);

    //I can do backslashes \, double backslashes \\,
    //and the amazing triple backslash \\\!


    String wow = "Check \"this\" out!, \"s inside of \"s!";
    System.out.println(wow);
//Check "this" out!, "s inside of "s!

    String c = "In windows, the main drive is usually C:\\";
    System.out.println(c);
    String backSlashes = "I can do backslashes \\, double backslashes \\\\,\n" +
      "and the amazing triple backslash \\\\\\!";
    System.out.println(backSlashes);
    //In windows, the main drive is usually C:\
  }
}
