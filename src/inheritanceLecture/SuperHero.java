package inheritanceLecture;

import OOPLecture.Person;

public class SuperHero extends Person {

  private String superPowerDescription;

  public SuperHero(String name, String superPowerDescription) {
    super(name);
    this.superPowerDescription = superPowerDescription;
  }
}
