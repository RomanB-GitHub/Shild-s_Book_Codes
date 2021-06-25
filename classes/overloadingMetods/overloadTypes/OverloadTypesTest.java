package classes.overloadingMetods.overloadTypes;

public class OverloadTypesTest {
    public static void main(String[] args) {
        OverloadTypesDemo overLo = new OverloadTypesDemo();
        int i = 88;

        overLo.test();
        overLo.test(4, 10);

        overLo.test(i);         // вызов метода test(double)
        overLo.test(123.7); //вызов метода test(double)
    }
}
