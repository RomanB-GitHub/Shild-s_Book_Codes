package ExceptionsInfo;

public class MultipleCatches {

  public static void main(String[] args) {
    try {
      int a = args.length; // аргументов в строке ноль - получаем первое исключение
      //если поменять на 1 -  то получим второе исключение
      System.out.println("a = " + a);
      int b = 42 / a;
      int[] c = {1};
      c[42] = 99;
    } catch (ArithmeticException e) {
      System.out.println("Деление на нуль: " + e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Ошибка индексации за пределами массива: " + e);
    }
    System.out.println("После блоков операторов try/catch");
  }
}

