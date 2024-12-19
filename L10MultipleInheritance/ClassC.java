package L10MultipleInheritance;

public class ClassC extends ClassB {
  public void methodC() {
    System.out.println("C - C");
  }

  public static void main(String[] args) {
    ClassC c1 = new ClassC();
    c1.methodA();
    c1.methodB();
    c1.methodC();
  }
}
/*
 * output
 * A - A
 * B - B
 * C - C
 */