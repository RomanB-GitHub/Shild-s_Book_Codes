package ExceptionsInfo;
// Продемонстрировать цепочки исключений

public class ChainExcDemo {

  static void demoproc() {
    // создать исключение
    NullPointerException e = new NullPointerException("верхний уровень исключения");

    //добавить причину исключения
    e.initCause(new ArithmeticException("реальная причина етого исключения"));
    throw e;
  }

  public static void main(String[] args) {
    try {
      demoproc();
    } catch (NullPointerException e) {
      // Вывести исключение верхнего уровня
      System.out.println("Перехваченое исключение: " + e);

      // Вывести исключение послужившее причиной для исключения верхнего уровня
      System.out.println("Первопричина : " + e.getCause());
    }
  }
}
