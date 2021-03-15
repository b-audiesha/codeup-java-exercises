public class Person {
  private String name;
// create a constructor. You can do it by pressing  ctrl+return

  public Person(String name) { this.name = name;}

  public String getName() { return this.name; }

  public void setName(String name) {this.name = name;
  }

  public void sayHello() {System.out.println(this.name + " Says Ello! "); }

  // create a person object to test out methods
//  public static void main(String[] args) {
//    Person p = new Person("audiesha");
//    p.sayHello();
//    p.setName("John");
//    p.sayHello();
//    System.out.println(p.getName());
//  }

}
