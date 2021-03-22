package WarmUps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUp {

    /* TODO: create a static method, secondListIsOneMore, that returns a boolean based on two passed
        lists of integers. If each integer in the second list is one more than the integer at the same
        index in the first list, the method will return true and false otherwise. Assume both lists are
        the same length.

        Examples:
        ... 1, 2, 3 and 2, 3, 4 returns true
        ... 1, 3, 6 and 2, 4, 7 returns true
        ... -5, 10, -200 and -4, 11, -199 returns true
        ... 1, 2, 3 and 2, 3, 5 returns false

     */

  public static void main(String[] args) {
    List<Integer> lOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    List<Integer> lTwo = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
    List<Integer> lThree = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
    System.out.println(secondListIsOneMore(lOne, lTwo)); // should return true
    System.out.println(secondListIsOneMore(lOne, lThree)); // should return false
    System.out.println(secondListIsOneMore(lTwo, lThree)); // should return true
  }
  public static boolean secondListIsOneMore(List<Integer> lOne, List<Integer> lTwo) {
    for (int i = 0; i < lOne.size(); i += 1) {
      if (lOne.get(i) + 1 != lTwo.get(i)) {
        return false;
      }
    }
    return true;
  }
}
