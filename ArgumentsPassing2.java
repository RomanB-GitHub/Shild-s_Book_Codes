// Обьекты передаються по ссылке

public class ArgumentsPassing2 {

  int a, b;

  ArgumentsPassing2(int i, int j) {
    a = i;
    b = j;
  }

  // передать обьект
  void meth(ArgumentsPassing2 ob) {
    ob.a *= 2;
    ob.b /= 2;
  }
}

class ArgumentsPassing2Test {

  public static void main(String[] args) {
    ArgumentsPassing2 ob = new ArgumentsPassing2(15, 20);
    System.out.println("a и b до вызова" + ob.a + " " + ob.b);
    ob.meth(ob);
    System.out.println("a и b после вызова" + ob.a + " " + ob.b);
  }
}
