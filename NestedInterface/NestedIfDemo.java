package NestedInterface;

public class NestedIfDemo {

  public static void main(String[] args) {
    // использовать ссылку на вложеный интерфейс
    A.NestedIF nif = new B();

    if (nif.isNotNegative(10)) {
      System.out.println("Число 10 не отрицательное");
    }

    if (nif.isNotNegative(-12)) {
      System.out.println("Это не будет выведено!");
    }
  }

}
