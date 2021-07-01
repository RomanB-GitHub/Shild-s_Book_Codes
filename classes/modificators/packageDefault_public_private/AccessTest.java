package classes.modificators.packageDefault_public_private;

public class AccessTest {
    public static void main(String... args) {
        Test ob = new Test();

        //Эти операторы правильныб поэтому члены a и b данного класса доступны непосредственно

        ob.a = 10;
        ob.b = 20;

        //Этот оператор оператор не верен и может вызывать ошибку
        // ob.c =100  --> Ошибка!

        //Доступ к члену с данного класса должен щсуществляться с помощью
        //методов его класса

        ob.setc(100);  // Верно!!!
        System.out.println("a,b,c : " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
