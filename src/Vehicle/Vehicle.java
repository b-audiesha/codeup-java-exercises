
package inheritanceLecture.vehicle;

public class Vehicle {

  private int numberOfOccupants;

  private int maxSpeed;

  public Vehicle() {
    this.maxSpeed = 0;
  }

  public Vehicle(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public void turnOn() {
    System.out.println("Starting...");
  }

  public int getNumberOfOccupants() {
    return numberOfOccupants;
  }

  public void setNumberOfOccupants(int numberOfOccupants) {
    this.numberOfOccupants = numberOfOccupants;
  }

}
