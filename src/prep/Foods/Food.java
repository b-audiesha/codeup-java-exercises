
package prep.Foods;

public abstract class Food implements Consumable{

  private String name;
  private String description;
  private int calories;

  public Food(String name, String description, int calories) throws IllegalArgumentException{

    if (name == null || name.equals("")){
      throw new IllegalArgumentException(String.format("The argument %s cannot be null or empty", name));
    }

    if (description == null || description.equals("")){
      throw new IllegalArgumentException(String.format("The argument %s cannot be null or empty", description));
    }

    if (calories <= 0){
      throw new IllegalArgumentException(String.format("The argument %s cannot be less than 1", calories));
    }

    this.name = name;
    this.description = description;
    this.calories = calories;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public void consume(){
    System.out.printf("NOM NOM NOM I HEART %s\n", name);
  }
}


//has private properties for String name, String description, and int calories
//takes in arguments in constructor in order to assign values to those properties (this.prop = value;)
//CONSTRUCTOR throws an IllegalArgumentException if any of the arguments are null or empty (note: integers cannot be null)
//You will need to both define the constructor as able to throw the exception and also conditionally actually throw the exception in the method body of the constructor
//create public getter and setter methods for each property
//HINT: there is a shortcut in Intellij that will do this for you
