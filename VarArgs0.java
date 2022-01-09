/*
 Использовать массив для передачи методу переменного количества
 аргументов.Это старый подход к обработке аргументов переменной длинны.
 */

public class VarArgs0 {

  static void vaTest(int[] v) {
    System.out.print("Количкство аргументов " + v.length + ", Содержимое : ");

    for (int x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    //Обоатите внимание на порядок создания массива для хранения аргументов
    int[] n1 = {10};
    int[] n2 = {1, 2, 3};
    int[] n3 = {};

    vaTest(n1); // один аргумент
    vaTest(n2); // три аргумента
    vaTest(n3); // без аргументов
  }


}
