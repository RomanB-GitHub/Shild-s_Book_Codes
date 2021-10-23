// продемонстрировать применение типа boolean

public class BooleanTest {

  public static void main(String[] args) {

    boolean b;

    b = false;
    System.out.println(" b равно " + b);

    b = true;
    System.out.println("теперь b будет равно " + b);

    //значение типа boolean может управлять оператором if
    if (b)
      System.out.println("Этот код выполняется");
    b = false;

    if (b)
      System.out.println("Этот код не выполняется");

    //результат сравнения типа boolean
    System.out.println("10 > 9 будет равно " + (10 > 9));
  }
}
