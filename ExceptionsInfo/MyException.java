package ExceptionsInfo;
//В этой программе создаетс специальный тип исключения

class MyException extends Exception {

  private int detail;

  MyException(int detail) {
    this.detail = detail;
  }

  public String toString() {
    return "MyException [" + detail + "]";
  }
}

class ExceptionDemo {

  static void compute(int a) throws MyException {
    System.out.println("Вызван метод compute(" + a + ")");
    if (a > 10) {
      throw new MyException(a);
    }
    System.out.println("Нормальное выполнение программы");
  }

  public static void main(String[] args) {
    try {
      compute(1);
      compute(20);
    } catch (MyException e) {
      System.out.println("Перехвачено исключение " + e);
    }
  }
}
