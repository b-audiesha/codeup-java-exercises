public class Person {
//Create Person class inside of src that has
// a private name property that is a string, and the following methods:
  public String name;
//The class should have a constructor that accepts a `String` value and sets
//the person's name to the passed string.
  public Person(String name){
    this.name = name;
  }
  public String getName(){
    //return the person's name
    return this.name;
  }

  public void setName(String name){
    //change the name property to the passed value
    this.name = name;
  }

  public void sayHello(){
    //print a message to the console using the person's name
    System.out.printf("%s says hello!", this.name);
  }


  //Create a `main` method on the class that creates a new `Person` object and
  //tests the above methods.
  public static void main(String[] args) {
    Person person1 = new Person("John");
    Person person2 = new Person("John");
    System.out.println(person1.getName().equals(person2.getName()));
    System.out.println(person1 == person2);


//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);
//
//    Person person1 = new Person("John");
//    Person person2 = person1;
    System.out.println(person1.getName());
    System.out.println(person2.getName());
    person2.setName("Jane");
    System.out.println(person1.getName());
    System.out.println(person2.getName());
  }
}
