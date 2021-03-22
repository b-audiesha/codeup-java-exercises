package prep;

public class Food {
  private String name;
  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Food(String name, String description, int calories) {
    this.name = name; //this.name is the private value that I am attaching to food object
    this.description = description;


  }
  }



//has private properties for String name, String description, and int calories
//takes in arguments in constructor in order to assign values to those properties (this.prop = value;)
//CONSTRUCTOR throws an IllegalArgumentException if any of the arguments are null or empty (note: integers cannot be null)
//You will need to both define the constructor as able to throw the exception and also conditionally actually throw the exception in the method body of the constructor
//create public getter and setter methods for each property
//HINT: there is a shortcut in Intellij that will do this for you
