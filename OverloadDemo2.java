//Применить автоматическое преобразование типов
// к перегрузке

public class OverloadDemo2 {

  void test() {
    System.out.println("The parameters is empty");
  }

  // перегружаемый метод проверяет наличие двух
  // целочисленных параметров
  void test(int a, int b) {
    System.out.println("a and b: " + a + " " + b);
  }

  // перегружаемый метод проверяет наличие параметра
  //типа double
  void test(double a) {
    System.out.println("Внутреннее приобразование при вызове test(double) a : " + a);
  }
}

class Overload2 {

  public static void main(String args[]) {
    OverloadDemo2 ob = new OverloadDemo2();
    int i = 88;

    ob.test();
    ob.test(10, 20);
    ob.test(i); // здесь вызываеться test(double)
    ob.test(123.2); // здесть тоже вызывается test(double)
  }
}
