public class StringExercise {
  public static void main(String[] args) {
   String thought = "We don't need no education,We don't need no thought control";
    String part1 = thought.substring(0, thought.indexOf(","));
    String part2 = thought.substring(part1.length() + 1);
    System.out.println(part1);
    System.out.println(part2);
// or this does the same thing in less lines
    String thoughts = "We don't need no education\n"+  "We don't need no thought control";
    System.out.println(thoughts);


  }
}
