package SimilarObjectsGroup;

public class Wolf{
  private final boolean isEndangered;
  private final String nativeArea;
  private final String sound;
  private final String subSpecies;
  private final String size;
  private final String commonName;
  public Wolf(String sound, String size, String subSpecies, String commonName, boolean isEndangered, String nativeArea) {
    this.sound = sound;
    this.subSpecies = subSpecies;
    this.size = size;
    this.commonName = commonName;
    this.isEndangered = isEndangered;
    this.nativeArea = nativeArea;
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
  public void printEndangeredStatus(){
    System.out.printf("Endangered: %s\n", getEndangeredStatus());
  }
  public void printNativeArea(){
    System.out.printf("Native Area: %s\n\n", this.nativeArea);
  }
  public void printDetails(){
    makeSound();
    printDelimiter();
    printSubSpecies();
    printCommonName();
    printNativeArea();
    printSize();
    printEndangeredStatus();
    printDelimiter();
  }
  private String getEndangeredStatus(){
    if (isEndangered){
      return "No";
    }else{
      return "Yes";
    }
  }
}
