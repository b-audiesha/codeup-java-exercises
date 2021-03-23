package prep.Foods;

import java.util.ArrayList;

public class Dinner extends Food{

  private boolean isSeasoned;

  public Dinner(String name, String description, int calories, boolean isSeasoned) {
    super(name, description, calories);
    this.isSeasoned = isSeasoned;
  }

  public boolean isSeasoned() {
    return isSeasoned;
  }

  public void setSeasoned(boolean seasoned) {
    isSeasoned = seasoned;
  }

  public ArrayList<String> getFullDescription(){

    String nameString = super.getName();
    String descriptionString = super.getDescription();
    String caloriesString = super.getCalories() + "";
    String isSeasonedString = isSeasoned()
      ? "Seasoned"
      : "Not Seasoned";

    ArrayList<String> list = new ArrayList<>();

    list.add(nameString);
    list.add(descriptionString);
    list.add(caloriesString);
    list.add(isSeasonedString);

    return list;
  }
}
