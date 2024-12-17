public class L6Methods {
  // void method - non static
  public void voidMethod() {
    System.out.println("I am a void method");
  }
  // int method - static
  public static int intMethod() {
    return 12;
  }
  // String method
  public static String stringMethod() {
    return "Sameer";
  }
  public static void main(String[] args) {
    L6Methods obj1 = new L6Methods();
    obj1.voidMethod(); // non static method calling

    // static method calling
    int var1 = intMethod();
    System.out.println(var1);

    String var2 = stringMethod();
    System.out.println(var2);
  }
}

/*
 * output
 * I am a void method
 * 12
 * Sameer
 */