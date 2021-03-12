import java.util.Arrays;

public class ArraysExercises {
  public static void main(String[] args) {
//    int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(Arrays.toString(numbers));
    Person[] people = new Person[3];
    people[0] = new Person("Austin");
    people[1] = new Person("Dallas");
    people[2] = new Person("Kyle");
    //Person objects and the group is called people.
    for (int i = 0; i < people.length; i++) {
      System.out.println(people[i].getName());
    }
    people = addPerson(people, new Person("Audiesha"));
// you can use the for loop here but instead here is the enhanced for loop here.
    for(Person person : people){
      System.out.println("Using enhanced for: " + person.getName());
    }
  }

  public static Person[] addPerson(Person[] people, Person person) {
    Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
    newPeopleArray[newPeopleArray.length - 1] = person; //same as person -1
    return newPeopleArray;
  }
}


