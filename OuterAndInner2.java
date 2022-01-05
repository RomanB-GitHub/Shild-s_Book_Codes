

public class OuterAndInner2 {

  int outer_x = 100;

  void test() {
    for (int i = 0; i < 10; i++) {
      class Inner {

        void display() {
          System.out.println("information outer_x = " + outer_x);
        }
      }
      Inner inner = new Inner();
      inner.display();
    }
  }

}

class InnerDemoClass {

  public static void main(String[] args) {
    OuterAndInner2 outer = new OuterAndInner2();
    outer.test();
  }
}
