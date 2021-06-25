package classes.overloadingMetods.usualOverloading;

public class OverloadTest {
    public static void main(String[] args) {
        OverloadDemo over = new OverloadDemo();
        double result;

        //вызвать все варианты метода test()
        over.test();
        over.test(10);
        over.test(10, 20);
        result = over.test(123.25);
        System.out.println("Результат вызова test(123.25) : " + result);

    }
}
