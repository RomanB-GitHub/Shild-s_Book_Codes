//Простой пример наследования

class InheritanceSuperA {

  int i;
  int j;

  void shwoij() {
    System.out.println("i and j : " + i + " " + j);
  }

}

class InheritanceSubB extends InheritanceSuperA {

  int k;

  void showk() {
    System.out.println("show k: " + k);
  }

  void sum() {
    System.out.println("(i + j + k) = " + (i + j + k));
  }

}

class InheritanceTest {

  public static void main(String[] args) {
    InheritanceSuperA superOb = new InheritanceSuperA();
    InheritanceSubB subOb = new InheritanceSubB();

    superOb.i = 10;
    superOb.j = 20;
    System.out.println("Содержимое обьекта superOb: ");
    superOb.shwoij();
    System.out.println();

    subOb.i = 7;
    subOb.j = 8;
    subOb.k = 9;
    System.out.println("Содержимое обьекта subOb: ");
    subOb.shwoij();
    subOb.showk();
    System.out.println();

    System.out.println("Сумма i,j,k в обьекте subOb: ");
    subOb.sum();
  }
}