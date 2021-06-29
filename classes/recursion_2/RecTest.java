package classes.recursion_2;

public class RecTest {
    public static void main(String[] args) {
        Rec ob = new Rec(10);
        int i;

        for (i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}
