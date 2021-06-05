public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        //здесь деление по модулю даст 1 в остатке (в 257 влазит 1раз
        // byte(256=1byte)  и остаток оттакого деления будет 1 ).
        System.out.println("\nПреобразование типа int --> byte");
        b = (byte) i;
        System.out.println("i and b " + i + " --> " + b);

        // здесь дробная часть пройдет усечение, останется только целая!
        System.out.println("\nПреобразование типа double --> int");
        i = (int) d;
        System.out.println("d and i " + d + " --> " + i);

        //здесь будет и усечение и деление по модулю(остаток 67 !!!)
        System.out.println("\nПреобразование типа double --> byte");
        b = (byte) d;
        System.out.println("d and b " + d + " --> " + b);
    }
}
