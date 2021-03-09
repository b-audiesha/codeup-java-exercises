public class Dish {

  public int costInCents;
  public String nameOfDish;
  public int stars;
  public boolean wouldRecommend;
  public boolean wouldNotRecommend;

  public void recommended() {
    wouldRecommend = true;
  }

  public void notRecommend() {
    wouldNotRecommend = true;
  }

  public String printSummary() {
    return "\n Cost :  " + costInCents
      + "\n Dish Name:  " + nameOfDish
      + "\n Recommend : " + wouldNotRecommend
      + "\n Stars: " + stars ;

  }
}

