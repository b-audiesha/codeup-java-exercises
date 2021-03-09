//Object fields
 public class Person {
  //instance variables
    public String firstName;
   public String middleName;
   public String lastName;
   public int age;
public boolean isAwake;
  public boolean isAsleep;
   //instance method
  public String sayHello() {
    return lastName + ", " + firstName + " says hi! ";
  }
    public void fallsAsleep() {
      isAwake = false;
     }
       public void staysAwake() {
      isAsleep = true;
    }

  }

