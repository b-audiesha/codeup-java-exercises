package prep.Foods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FoodTools {

  public static void initializeApp(){
    int caloriesConsumed = printConsumeFoodsAndCountCalories(getFoods());
    System.out.printf("Total Calories Consumed: %s", caloriesConsumed);
  }

  public static ArrayList<Food> getFoods(){
    return new ArrayList<>(Arrays.asList(
      new Dinner("Casserole", "Concoction of whatever I find", 1200, true),
      new Dinner("Pizza", "Delicious pie of the gods", 600, false),
      new Dinner("Giant Salad", "Things that grow out of the ground, in a bowl", 250, false)));
  }

  //TODO: Make this better!
  public static int printConsumeFoodsAndCountCalories(ArrayList<Food> foods){
    int caloriesConsumed = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("------------------------");
    for (Food food : foods){
      System.out.println(getPrintableString(food.getFullDescription()));

      System.out.println("Would you like to eat this? (y/n)");

      String response = sc.nextLine().toLowerCase();

      if (response.equals("y")){
        food.consume();
        caloriesConsumed += food.getCalories();
      }
    }

    return caloriesConsumed;
  }

  public static String getPrintableString(List<String> strings){
    StringBuilder printableString = new StringBuilder();
    for (String string : strings){
      printableString.append(string).append("\n");
    }
    printableString.append("------------------------\n");

    return printableString.toString();
  }
}
