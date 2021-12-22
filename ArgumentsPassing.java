// аргументы примитивных типов передаются по значению

class ArgumentsPassing1 {

  void meth(int i, int j) {
    i *= 2;
    j /= 2;
  }
}

class CallByValue {

  public static void main(String args[]) {
    ArgumentsPassing1 ob = new ArgumentsPassing1();
    int a = 15;
    int b = 20;
    System.out.println(" а и в до вызова : " + a + " " + b);
    ob.meth(a, b);
    System.out.println(" а и в после вызова : " + a + " " + b);
  }
}