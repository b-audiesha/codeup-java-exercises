public class oopLecture {
  public static void main(String[] args) {


    Person p1 = new Person();
    p1.firstName = "Austin";
    p1.middleName = "Lawrence";
    p1.lastName= "Brattin";

    System.out.println(p1.firstName);

    Person p2 = new Person();
    p2.firstName = "Dallas";
    p2.middleName = "Ryan";
    p2.lastName= "Brattin";
    System.out.println(p2.firstName);

    Person p3 = new Person();
    p3.firstName = "Kyle";
    p3.middleName = "Patrick";
    p3.lastName= "Brattin";
    System.out.println(p3.firstName);
    System.out.println(p3.middleName);
    System.out.println(p3.lastName);


  //  System.out.println(p1); this prints the reference ID not the person. Where the entry point of the object is in memory
    System.out.println("Hello  "
      + p1.firstName
      + " , "
      + p2.firstName
      + " , "
      +  p3.firstName);
  }
}
