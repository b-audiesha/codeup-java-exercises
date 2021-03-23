package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

  private final Map<String, Student> students;
  private final Input input;

  public GradesApplication(Map<String, Student> students, Input input) {
    this.students = students;
    this.input = input;
  }

  // Starts App
  public void init() {
    System.out.println("Welcome!");
    runInteraction();
  }

  // Abstracts the Part that Repeats
  private void runInteraction() {
    System.out.println(getStudentsList());
    System.out.println("\nWhat student would you like to see more information on?");
    String response = input.getString("Please enter an integer");
    if (students.containsKey(response)) {
      System.out.println(getStudentInfo(response));
    } else {
      System.out.println("\nSorry, no student found with the GitHub username of " + response);
    }
    System.out.println("\nWould you like to enter a new response?");
    boolean willContinue = input.yesNo();
    if (willContinue) {
      runInteraction();
    } else {
      System.out.println("\nGoodbye!");
    }
  }

  // Returns a message containing a list of students
  private String getStudentsList() {
    String output = "Here are the user names of our students:\n\n";
    for (Map.Entry<String, Student> entry : students.entrySet()) {
      output += "|" + entry.getKey() + "| ";
    }
    return "\n" + output.trim();
  }

  // Returns a formatted message containing student information
  private String getStudentInfo(String username) {
    return String.format(
      "%nName: %s - GitHub Username: %s%nCurrent Average: %.2f",
      students.get(username).getName(),
      username,
      students.get(username).getGradeAverage());
  }

  // Used to populate the HashMap of students
  private static HashMap<String, Student> createStudents() {

    HashMap<String, Student> students = new HashMap<>();

    Student s1 = new Student("Fred");
    s1.addGrade(0);
    s1.addGrade(50);
    s1.addGrade(100);

    Student s2 = new Student("Cathy");
    s2.addGrade(50);
    s2.addGrade(50);
    s2.addGrade(75);

    Student s3 = new Student("Bob");
    s3.addGrade(80);
    s3.addGrade(20);
    s3.addGrade(100);

    students.put("fred123", s1);
    students.put("cathy123", s2);
    students.put("bob123", s3);

    return students;

  }

  public static void main(String[] args) {
    GradesApplication ga = new GradesApplication(createStudents(), new Input());
    ga.init();
  }


}
