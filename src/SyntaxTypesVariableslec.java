public class SyntaxTypesVariableslec {

  public static void main(String [] args){
    //CODE BLOCKS ==================================
    {
      String sentence = "Hi, my name is";
      System.out.println(sentence);
    }
//byte	1	Very short integers from -128 to 127
    byte bite = 127;
    System.out.println(
      ((Object)bite)
      .getClass()
      .getName());
//short	2	Short integers from -32,768 to 32,767
    short shrt = 32000;
     System.out.println(
       ((Object)shrt)
       .getClass()
       .getName());
//int	4	Integers from -2,147,483,648 to 2,147,483,647
     int myInt = 2147483647;
     System.out.println(
       ((Object)myInt)
         .getClass()
         .getName());
//long	8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
   long lng = 9223372036854775807L;
    System.out.println(
      ((Object)lng)
        .getClass()
        .getName());

    // ARITHMETICS ON DIFFERENT TYPES =======================

    byte bite1 = 111;
    byte bite2 = 1;
    var output = bite2 + bite1;
    System.out.println(((Object)output)
      .getClass()
      .getName());

    int maxInt = 2147483647;
    System.out.println(maxInt + 1);
      // or (these are the same)
    int minValue = Integer.MIN_VALUE;
    System.out.println(minValue + 1);

    int maxValue = Integer.MAX_VALUE;
    System.out.println(maxValue + (maxValue +3 ));
 //FLOAT & DOUBLE
//    float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
//    double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
    float flt = 1.1F; //this is okay if you need to use a decimal.
    float flt2 = 12345e4F; //you can use scientific notation.
    double dbl = 1.1; // there is no need for the F when using a decimal point

    //boolean
boolean isTrue = true;
//    boolean isTrue = (1 > 2);
//    boolean isFalse = (1 < 2) && (1 > 2);

    char  letter = 'a'; //must use single quotes unless your using var
    char letter2 ='b';
    var  charOutput = letter + letter2; // the output will give you an integer if you look up the type.
    System.out.println(charOutput);
//      .getClass()
//      .getName());

    String myString = "This is my first line\nThis is my second line";
    System.out.println(myString);

    String myIndentedString = "\nThink Bold."+"\n\n\tThink Big" + "\n\n\t\tThink Different" +" \n";
    System.out.println(myIndentedString); // looks like this ->
  // Think Bold.

    //         Think Big

    //                   Think Different

    int num =1; // we declared num as a integer so you cant put it into a string unless you put it into a variable
    //you can reassign the value as long as it is the same type but you assign it a different type of data
   //  boolean myBool= '1'; the string is not a boolean... so this will not work.
     boolean myBool = false;

//While technically it is allowed to use identifiers with underscores, dollar signs, or digits,
// we discourage the use of any of these.
// You should use camelCase for variable and method names, and PascalCase for class names.

                                                            //Arithmetic Expressions
    //Binary vs. Unary

    //An arithmetic expression consists of operands and arithmetic operators.
    //Binary operators operate on two operands
    //Unary operators operate on one operand
    //Order of Precedence

    //Increment
    //
    // a++ or ++a
    int i = (1 + 1);
    System.out.println("First Combo: " + (++i  + i++ + i++));
    System.out.println("Second Combo: " + (i++  + ++i  +  ++i ));
    // and decrement
    // a-- or --a
    //Positive and negative
    //Multiplication, division, and modulus
    //Addition and subtraction

    //=======Casting===========//
//Casting is coercing a value of one type into another.
// There are two types of casting, implicit casting and explicit casting.
    //=========implicit ==========//
    int anInteger = 345; //this variable doesnt change
    long isALong = anInteger;//this value becomes a new type
    double aDouble =345;
    System.out.println(aDouble);
    System.out.println(anInteger);

    //=====explicit=====//




  }
}
