package SimilarObjectsGroup;
public class Dog{
  private final String size;
  private final String sound;
  private final String subSpecies;
  private final String commonName;
  private final String furColor;
  public Dog(String sound, String size, String subSpecies, String commonName, String furColor) {
    this.sound = sound;
    this.size = size;
    this.subSpecies = subSpecies;
    this.commonName = commonName;
    this.furColor = furColor;
  }
  public void makeSound() {
    System.out.println(sound + "\n");
  }
  public void printDelimiter(){
    System.out.println("****************************");
  }
  public void printSubSpecies(){
    System.out.printf("Sub-Species: %s\n", this.subSpecies);
  }
  public void printCommonName(){
    System.out.printf("Common Name: %s\n", this.commonName);
  }
  public void printSize(){
    System.out.printf("Size: %s\n", this.size);
  }
  public void printFurColor(){
    System.out.printf("Fur Color: %s\n", this.furColor);
  }
  public void printDetails(){
    makeSound();
    printDelimiter();
    printSubSpecies();
    printCommonName();
    printSize();
    printFurColor();
    printDelimiter();
  }
}
