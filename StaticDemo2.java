public class StaticDemo2 {

  static int a = 34;
  static int b = 92;

  static void callMe() {
    System.out.println(" a = " + a);
  }
}

class StaticByName {

  public static void main(String[] args) {
    StaticDemo2.callMe();
    System.out.println(" b = " + StaticDemo2.b);
  }
}
