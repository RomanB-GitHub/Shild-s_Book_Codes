public class VarArgs3 {

  static void vaTest(int... v) {
    System.out.print("vaTest(int...): "
        + "Количество аргументов: "
        + v.length + " Содержимое: ");

    for (int x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  static void vaTest(boolean... v) {
    System.out.print("vaTest(boolean ...): " +
        "Количество аргументов: " + v.length
        + " Содержимое: ");

    for (boolean x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  static void vaTest(String msg, int... v) {
    System.out.print("vaTest(String msg,int...): "
        + msg + v.length
        + " Содержимое: ");

    for (int x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  static void vaTest(int i) {
    System.out.print("vaTest(int i): "
        + "Количество аргументов "
        + 1 + " Содержимое: ");

    System.out.println(i);
  }

  public static void main(String[] args) {
    vaTest(1, 2, 3);
    vaTest("Проверка: ", 10, 20);
    vaTest(14);
    vaTest(true, false, true);
  }

}
