public class L2StaticAndNonStaticVariables {
  // static variables
  static int var1 = 23;

  public static void main(String[] args) {
    // Access using class Name
    System.out.println("Static Member using Class Name-> " + L2StaticAndNonStaticVariables.var1);

    // Access using direct variable name
    System.out.println("Static Member using direct variable Name-> " + var1);

    // Access using object (reference) name
    //L2StaticAndNonStaticVariables obj1 = new L2StaticAndNonStaticVariables();
    //System.out.println("Static Member using reference Name-> " + obj1.var1); //Internally obj1.var1 is converted into L2StaticAndNonStaticVariables.var1
  }

}

/*
 * output:
 Static Member using Class Name-> 23
Static Member using direct variable Name-> 23
Static Member using reference Name-> 23
 */