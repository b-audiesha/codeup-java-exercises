public class dishTest {
  public static void main(String[] args) {

    Dish dish1 = new Dish();
    dish1.costInCents = 600;
    dish1.nameOfDish = "Gyoza";
    dish1.wouldRecommend = true;
    dish1.stars = 5;
    System.out.println(dish1.printSummary());

    Dish dish2 = new Dish();
    dish2.costInCents = 900;
    dish2.nameOfDish = "Okonomiyaki Fries";
    dish2.wouldRecommend = false;
    dish2.stars = 1;
    System.out.println(dish2.printSummary());

    Dish dish3 = new Dish();
    dish3.costInCents = 600;
    dish3.nameOfDish = "Seaweed Salads";
    dish3.wouldRecommend = false;
    dish3.stars = 2;
    System.out.println(dish3.printSummary());
  }


}


//OOP SHORT ASSIGNMENT #1 --
// XX Create a class called Dish. This class will represent various restaurant dishes.
//Include an integer property called “costInCents”
//Include a string property called “nameOfDish”
//Include a boolean property called “wouldRecommend”
//Include a method called “printSummary” with a void return type
//    this method will use a single printf method to print out the values of each of the instance properties in the following format:
//      Cost: COST_IN_CENTS_HERE
//      Name: NAME_OF_DISH_HERE
//      Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//Create another class called DishTest
//Add a main method and inside the method...
//    1) instantiate a Dish object and assign to a variable called dish1
//    2) assign creative values for each of the properties
//    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
