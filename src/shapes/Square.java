package shapes;

public class Square extends Quadrilateral{


  public Square(double side){
    super(side, side);
  }

  public double getArea(){
    System.out.println("\nSQUARE getArea() Running...");
    return Math.pow(super.length, 2);
  }

  public double getPerimeter(){
    System.out.println("\nSQUARE getPerimeter() Running...");
    return super.length * 4;
  }

  public void setLength(double side) {
    super.length = side;
    super.width = side;
  }

  public void setWidth(double side) {
    super.width = side;
    super.length = side;
  }
}
