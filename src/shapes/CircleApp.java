package shapes;
import util.Input;

// Dont blame me for using cookie, I am currently super hungry.
public class CircleApp {
  public static void main(String[] args) {
    Input input = new Input();
    double radius = input.getDouble(0, 100000);
    Circle cookie = new Circle(radius);
    System.out.println(cookie.getCircumference());
    System.out.println(cookie.getArea());

  }
}
