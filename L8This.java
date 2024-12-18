public class L8This {
  L8This() {
    this(20);
    System.out.println("Constructor chaining - 1");
  }

  L8This(int x) {
    this(2, 3);
    System.out.println("Constructor chaining - 2");
  }

  L8This(int v1, int v2) {
    System.out.println("Constructor chaining - 3");
  }

  public static void main(String[] args) {
    L8This obj1 = new L8This();
  }
}
/*
 * output
 * Constructor chaining - 3
 * Constructor chaining - 2
 * Constructor chaining - 1
 */