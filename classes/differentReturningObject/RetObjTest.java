package classes.differentReturningObject;

public class RetObjTest {
    public static void main(String... args) {

        RetObj ob1 = new RetObj(2);
        RetObj ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);

    }
}
