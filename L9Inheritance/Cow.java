package L9Inheritance;

public class Cow extends Dog {
  public static void main(String[] args) {
    Cow c1 = new Cow();
    c1.sleep();
    c1.eat();
  }
}
/*
 * output
 * Sleeping....
 * Eating....
 */