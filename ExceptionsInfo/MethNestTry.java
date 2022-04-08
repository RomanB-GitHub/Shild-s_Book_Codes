package ExceptionsInfo;

public class MethNestTry {

  static void nesttry(int a) {
    try {//вложеный блок оператора try
      /*
      Если указан один елемент командной строки то исключение
      в связи с делением на нуль будет сгенерировано в следующем коде
      */
      if (a == 1) {
        a = a / (a - a);// деление на нуль
      }
      /*
      Если указаны два елемента командной строки то генерируется
      исключение в связи с выходом за пределы массива
      */
      if (a == 2) {
        int[] c = {1};
        c[42] = 99; // здесь генерируется исключение в связи с выходом за пределы массива
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Индекс за пределами массива :" + e);
    }
  }

  public static void main(String[] args) {
    try {
      int a = args.length;
      /*
      Если не указаны аргументы командной строки в следующем операторе
      будет сгенерировано исключение в связи с делением на нуль
       */
      int b = 42 / a;
      System.out.println("a = " + a);
      nesttry(a);
    } catch (ArithmeticException e) {
      System.out.println("Деление на нуль : " + e);
    }
  }

}
