//Аргументы переменной длинны перегрузка и неоднозначностью.
//Эта проверка, содержит ошибку, и поэтому она не может подлежать компиляции

public class VarArgs4 {

  static void vaTest(int... v) {
    System.out.print("vaTest(int...): "
        + " Количество аргументов: "
        + v.length
        + " Содержимое: ");

    for (int x : v) {
      System.out.print(x + " ");
    }
    System.out.println();

  }

  static void vaTest(boolean... v) {
    System.out.print(
        "vaTest(boolean ...): "
            + " Количество аргументов:"
            + v.length
            + " Содержимое: ");

    for (boolean x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }
 //static void vaTest(int m, int ... k){ }
  /* акоментированая строка выше даст неоднозначность,
  компилятор не может определить каккой метод выбрать для реализации
  vaTest(int ...)  или vaTest(int m,int ... k)
  */

  public static void main(String[] args) {
    vaTest(1, 2, 3);
    vaTest(false, true, false);
    //vaTest(); // Ошибка!!! Неоднозначная ситуация!!! Компилятор не может выбрать метод !
  }
}
