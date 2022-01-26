// Переопределение метода
class OverrideA {

  int i, j;

  OverrideA(int a, int b) {
    i = a;
    j = b;
  }

  //вывести содержимое
  void show() {
    System.out.println("i and j : " + i + " " + j);
  }

}

class OverrideB extends OverrideA {

  int k;

  public OverrideB(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  void show() {
    System.out.println("k : " + k);
  }
}

class OverrideAB {

  public static void main(String[] args) {
    OverrideB obB = new OverrideB(1, 2, 3);
    obB.show(); // здесь вызывается метод show() из класса B
  }
}
