// Методы которые отличаются сигнатурами считаются
// перегружаемыми, а не переопределенными!!!
public class OverloadA {

  int i, j;

  OverloadA(int a, int b) {
    i = a;
    j = b;
  }

  //вывести содержимое переменной
  void show() {
    System.out.println("i and j : " + i + " " + j);
  }
}

class OverloadB extends OverloadA {

  int k;

  public OverloadB(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  void show(String msg) {
    System.out.println(msg + k);
  }
}

class OverloadAB {

  public static void main(String[] args) {
    OverloadB loadB = new OverloadB(6, 7, 8);
    loadB.show("This is k = ");//вызов метода show() из класса OverloadB
    loadB.show();//вызов метода show() из класса OverloadB
  }
}