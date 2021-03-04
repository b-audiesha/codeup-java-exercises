public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
    int myFavoriteNumber = 27;
    System.out.println(myFavoriteNumber); //PRINTS 27

    // Create a String variable named myString and assign a string value to it, then print the variable out to the console.
    String myString = "Java is fun";
    System.out.println(myString); //Java is fun
//Change your code to assign a character value to myString. What do you notice?
    //char myString = 2; // this prints nothing
    //  System.out.println(myString);
    //Change your code to assign the value 3.14159 to myString. What happens?
    // String myString = 3.14159;
    // 3.14159 is not a string so it prints nothing
    // Change your code to assign the value 3.14 to myNumber. What do you notice?
    //long myNumber;
    // System.out.println(myNumber);  gives this error variable myNumber might not have been initialized
    // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
    // long myNumber = 123L;
    // System.out.println(myNumber); //prints 123
    //Change your code to assign the value 123 to myNumber. --> this makes no difference using 123
//    Why does assigning the value 3.14 to a variable declared as a long not compile,
//    but assigning an integer value does?
    //long decimalNumber = 3.14; // this will throw an error because of the decimal
    //Change your code to declare myNumber as a float.
    // Assign the value 3.14 to it. What happens? What are two ways we could fix this?
    float myNumber = 3.14f; // this prints 3.14 as long as it has an f
    System.out.println(myNumber); // wont work unless you put an f

   // int x = 5;
    //System.out.println(x++); //5    confused on this one
   // System.out.println(x); //6

   // int y = 5;
    //System.out.println(++y); //6 confused on this one
  //  System.out.println(y); //6
    //Try to create a variable named class. What happens?
 // var class = "" cant do it because class is a word that you cannot use

    //Object is the most generic type in Java. You can assign any value to a variable of type Object.
    // What do you think will happen when the following code is run?
//    String theNumberThree = "three";
//    Object o = theNumberThree;
//    int three = (int) o;
    // throws this error --> Exception in thread "main" java.lang.ClassCastException:
    // class java.lang.String cannot be cast to class java.lang.Integer
    // (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
    //	at HelloWorld.main(HelloWorld.java:42)
    //int three = (int) "three"; incompatible types: java.lang.String cannot be converted to int

//    int x = 4;
//    x = x + 5;

int x = 4;
x += 5;

    //int x = 3;
   // int y = 4;
   // y = y * x;
int y =3;
int z = 4;

   // int x = 10;
    //int y = 2;
  //  x = x / y;
   // y = y - x;



  }
}

