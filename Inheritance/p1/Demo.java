package Inheritance.p1;

public class Demo {

  public static void main(String[] args) {
    Protection obj1 = new Protection();
    System.out.println("***");
    Derived obj2 = new Derived();
    System.out.println("***");
    SamePackage obj3 = new SamePackage();
  }

}
