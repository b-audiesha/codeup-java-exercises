package InheritanceLecture;


public class InheritanceLecture {
  public static void main(String[] args) {
    Person p =new Person();
    p.name = "audiesha";
    System.out.println(p.getName());

    Employee e = new Employee();
    e.name = "Bob";
    System.out.println(e.getName());
  }
}
