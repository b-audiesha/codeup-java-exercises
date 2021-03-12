public class Person {
  private String name;
// create a constructor. You can do it by pressing  ctrl+return

  public Person(String name) {
    this.name = name;
  }

  public String getName(){
//TODO: return the person's name
    return this.name;
  }

  public void setName(String name){
//TODO: change the name property to the passed value
    this.name = name;
  }
  public void sayHello(){
//TODO: print a message to the console using the person's name
    System.out.println(this.name + "Says Ello! ");

  }
  // create a person object to test out methods
  public static void main(String[] args) {
    Person p = new Person("audiesha");
    p.sayHello();
  }
}
