
// Применение оператора continue
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println(" ");

        }
    }
}
// в данном коде если значение четное то выполнение переходитна новую строку!