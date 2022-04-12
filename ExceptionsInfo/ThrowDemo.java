package ExceptionsInfo;

public class ThrowDemo {

  static void demoproc() {
    try {
      throw new NullPointerException("Демонстрация!");
    } catch (NullPointerException e) {
      System.out.println("Исключение перехвачено в теле метода demoproc().");
      throw e; // повторно сгенерировать исключение
    }
  }

  public static void main(String args[]) {
    try {
      demoproc();
    } catch (NullPointerException e) {
      System.out.println("Повторный перехват:" + e);
    }
  }

}
