package inheritanceLecture;

import OOPLecture.Person;

public class Employee extends Person {

  public int employeeNumber;
  public String getName() {
    String name = "Audi";
    return "hello; my name is " + name + ". How can I help you ?";
  }
}
