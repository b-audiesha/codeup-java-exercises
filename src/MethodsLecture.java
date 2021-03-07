public class MethodsLecture {
  public static void main(String[] args) {
    System.out.println(getNameString( "Audiesha"));
  }

  // ============== Method Definitions ===============
// *** Access Modifiers ***
  public static String getNameString(String name) {
    if ((name == null) || (name.equals(""))) {
      return "No Name Provided";
    } else {
    return name;
  }
}





// *** Static vs Instance ***
// *** Returning vs Void ***
// *** Parameters ***
// ============ Mini Exercise #1 =============
// ============== Method Overloading ===============
// ============ Mini Exercise #2 =============
// ============== Recursion ===============
// ============== Responsible Method Use ===============
}
