import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;
import java.util.List;

public class FileIoPractice {
  public static void main(String[] args) {
//    File path = null;
//    Path p = Path.of(path.getPath());
    Path p = Paths.get("fileIo/people.txt");
    List<String> name = new ArrayList<>();
    try {
      for (String person : name = Files.readAllLines(p)) {
        System.out.println(person+ " works at Codeup");
      };
    } catch (IOException e) {
      e.printStackTrace();
    }
List<String> newKidsOnCampus = new ArrayList<>();
    newKidsOnCampus.add("Audi");
    newKidsOnCampus.add("Corey");
    newKidsOnCampus.add("Carlos");
    newKidsOnCampus.add("Sam");

    try {
      Files.write(p, newKidsOnCampus);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
