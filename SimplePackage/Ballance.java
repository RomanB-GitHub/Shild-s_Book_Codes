package SimplePackage;

class Ballance {

  String name;
  double bal;

  Ballance(String n, double b) {
    name = n;
    bal = b;
  }

  void show() {
    if (bal < 0) {
      System.out.println("-->");
    }
    System.out.println(name + ": $" + bal);
  }

}
