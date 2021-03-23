package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

  private String name;
  private List<Integer> grades;

  public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
  }

  // returns the student's name
  public String getName() {
    return name;
  }

  // adds the given grade to the grades property
  public void addGrade(int grade) {
    grades.add(grade);
  }
  // returns the average of the students grades
  public double getGradeAverage() {
    return (double) grades.stream().reduce(Integer::sum).get() / grades.size();
  }

}
