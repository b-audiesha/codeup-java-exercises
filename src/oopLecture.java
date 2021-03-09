public class oopLecture {
  public static void main(String[] args) {


    Person p1 = new Person();
    p1.firstName = "Austin";
    p1.middleName = "Lawrence";
    p1.lastName= "Brattin";
    p1.age=4;
    Person otherP1Name = p1;
    System.out.println(otherP1Name); //example "oh, that guy..oh that girl = alternative name for the same object"
    System.out.println(p1.sayHello());
    System.out.println(p1.firstName);
    System.out.println(p1.age);
    System.out.printf("%s %s %d \n",
      p1.firstName, p1.lastName, p1.age);
    // prints Austin Brattin 4 %s is string %d is integer \n is the break to next line.

    Person p2 = new Person();
    p2.firstName = "Dallas";
    p2.middleName = "Ryan";
    p2.lastName= "Brattin";
    p2.age= 6;
   // System.out.println(p2.firstName);
  //  System.out.println(p1 == p2); will give you a false
//    System.out.println(p2.firstName.equals(p2.firstName));

    Person p3 = new Person();
    p3.firstName = "Kyle";
    p3.middleName = "Patrick";
    p3.lastName= "Brattin";
    p1.age= 26;
    System.out.println(p3.firstName);
    System.out.println(p3.middleName);
    System.out.println(p3.lastName);

    Person p4 = new Person();
    p4.firstName = "Audiesha";
    p4.middleName = "Marie";
    p4.lastName= "Perry";
    p1.age= 29;
    System.out.println(p3.firstName);


  //  System.out.println(p1); this prints the reference ID not the person. Where the entry point of the object is in memory
    System.out.println("Hello  "
      + p1.firstName
      + " , "
      + p2.firstName
      + " , "
      +  p3.firstName);
  }
}
