public class L4TypesOfVariables {
  // static variable
  static int var1 = 55;
  //object is created using static
  static L4TypesOfVariables a1=new L4TypesOfVariables();

  public static void main(String[] args) {
    // Local variable
    int var1 = 5;
    System.out.println("Local Variable " + var1);
    System.out.println("Static vaiable " + L4TypesOfVariables.var1);

    L4TypesOfVariables obj1 = new L4TypesOfVariables();
    obj1.test();

    System.out.println(a1);
  }

  public void test() {
    L4TypesOfVariables refVar1 = null;
    System.out.println("Reference -> " + refVar1);
    refVar1 = new L4TypesOfVariables();
    System.out.println("Reference -> " + refVar1);
    System.out.println(a1);
  }
}

/*
 * output
 * Local Variable 5
 * Static vaiable 55
 * Reference -> null
 * Reference -> L4TypesOfVariables@681a9515
 */