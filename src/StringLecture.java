public class StringLecture {

  public static void main(String[] args) {

//        .equals(String anotherString) //compares two strings

    String one = "2";
    String two = "2";
    System.out.println(one.equals(two));


//        .equalsIgnoreCase(String anotherString)

    String greeting = "howdy";
    System.out.println(greeting.equalsIgnoreCase("HoWDy"));


//        .startsWith(String prefix)

    String title = "Dr. Doctor";
    boolean isADoctor = title.toLowerCase().startsWith("dr"); // seeing if dr is basically equal to Dr. by converting it all to lower case.
    System.out.println(isADoctor);


//        .endsWith(String suffix)

    String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
    String codeUpZip = "78205";
    boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);

    System.out.println(sameZipAsCodeup);


//        .charAt(int index)
    // consider that this method returns a char type and not a String type

    boolean firstLetterCapitalized = false;
    String word = "teSt";
//char thirdLetter =word.charAt(2);
    char firstLetter = word.charAt(0); // the t is stored in a variable called char..because the t is at the index of 0
// if the t in test  is equal to an upper case T. Character is a class
    if (firstLetter == Character.toUpperCase(firstLetter)) {
      firstLetterCapitalized = true;
    }
    System.out.println(firstLetterCapitalized);
//this is false because the t is not capitalized


//        .indexOf(String subString)

    String cat = "cat";
    System.out.println(cat.indexOf("at"));
//this will print 1 because the "at" begins on the index of 1.

//        .lastIndexOf(String subString)

    String good = "Good";
    System.out.println(good.indexOf("o")); // 1
    System.out.println(good.lastIndexOf("o")); // 2


//        .length() in java length is a method and not a property

    String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
    System.out.println(longestWord.length()); //45


//        .replace(char oldChar, char newChar)

    String search = "tiny cats looking cute";
    String parsedSearch = search.replace("cats", "dogs");
    System.out.println(parsedSearch);

// tiny dogs looking cute

    String searchForSpace = "I am searching for blank space";
    String newSearch = searchForSpace.replace(" ", ",");
    System.out.println(newSearch);
// I,am,searching,for,blank,space

//        .substring(int beginIndex[, int endIndex])

//    String name = "Justin Bob Reich";
//    String firstName = name.substring(0, name.indexOf(" "));
//
//    String lastName = name.substring(name.lastIndexOf(" ") + 1);
//    System.out.println(firstName);
//    System.out.println(lastName);
    //Justin
    //Reich

    String name = "Justin Reich";
    String firstName = name.substring(0, name.indexOf(" "));
    System.out.println(firstName);
    String lastName = name.substring(firstName.length() + 1);
    System.out.println(lastName);
    //Justin
    //Reich

//        .toLowerCase()
//        .toUpperCase()

    String hello = "hELlo";
    System.out.println(hello.toUpperCase()); //HELLO
    System.out.println(hello.toLowerCase()); //hello
    System.out.println(hello); // hELlo


//        .trim()

    String input = "   bob      smith \n\n  ";
    String trimmedInput = input.trim();
    System.out.println(trimmedInput); //bob      smith
//    System.out.print("|" + input + "|");
// |   bob      smith

//  |


//         convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)


    //ask for help on this one
    String word1 = "cat";
    String pigLatinWord = word1
      .trim()
      .toLowerCase()
      .substring(1)
      .concat(word1.substring(0, 1).toLowerCase()) //ca
      .concat("ay");
    System.out.println(pigLatinWord);
  }

}
