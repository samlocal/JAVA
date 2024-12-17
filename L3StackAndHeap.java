public class L3StackAndHeap {
  public static void main(String[] args) {
    L3StackAndHeap obj1 = new L3StackAndHeap();
    obj1.test1();
    System.out.println(98);
  }

  public void test1() {
    L3StackAndHeap obj2 = new L3StackAndHeap();
    obj2.test2();
    System.out.println(99);
  }

  public void test2() {
    System.out.println(100);
  }
}

/*
 * output
 * 100
 * 99
 * 98
 */