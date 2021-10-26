// Продемонстрировать приведение типов

public class Conversion {

  public static void main(String[] args) {
    byte b;
    int i = 257;
    double d = 323.142;

    System.out.print("***");
    System.out.print("\nПреобразование типа int в byte.");
    b = (byte) i;
    System.out.println("i and b " + i + " -> " + b + ("произошло деление по модулю 257-256"
        + " где 256 это от -128...0..до..127"));

    System.out.println("***");
    System.out.println("Преобразование типа double в int");
    i = (int) d;
    System.out.println("d and i " + d + " -> " + i);

    System.out.println("***");
    System.out.println("Преобразование типа double в byte");
    b = (byte) d;
    System.out.println("d and b " + d + " -> " + b);
  }
}
