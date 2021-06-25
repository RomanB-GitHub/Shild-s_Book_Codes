package classes.ObjectLikeParametr;

public class PassOb {
    public static void main(String[] args) {
        Test object1 = new Test(100, 22);
        Test object2 = new Test(100, 22);
        Test object3 = new Test(-1, -1);

        System.out.println("object1 == oobject2 : " + object1.equalTo(object2));
        System.out.println("object1 == oobject3 : " + object1.equalTo(object3));
    }
}
