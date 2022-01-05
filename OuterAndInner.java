public class OuterAndInner {

  int outer_x = 100;

  void test() {

    Inner inner = new Inner();
    inner.display();
  }

  class Inner {

    void display() {
      System.out.println("Variable outer_x = " + outer_x);
    }
  }

}

class InnerClassDemo {

  public static void main(String[] args) {
    OuterAndInner outer = new OuterAndInner();
    outer.test();
  }

}
