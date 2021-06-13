/**
 * Демонстрация приминения цикла while
 */
public class While {
    public static void main(String[] args) {
        int n = 10;

        while (n > 0){      //В начале цикла while вычисляется условное выражение, поэтому
                            // тело цикла не будет выполнено ни разу, если в самом начале условие оказывается ложным.
            System.out.println("Такт № " + n);
            n--;
        }
    }
}
