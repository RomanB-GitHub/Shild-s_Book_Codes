public class ReturnObject {

  int a;

  ReturnObject(int i) {
    a = i;
  }

  ReturnObject incrByTen() {
    ReturnObject temp = new ReturnObject(a + 10);
    return temp;
  }
}

class RetObjTest {

  public static void main(String args[]) {
    ReturnObject obj1 = new ReturnObject(2);
    ReturnObject obj2;

    obj2 = obj1.incrByTen();
    System.out.println("ob1.a = " + obj1.a);
    System.out.println("ob2.a = " + obj2.a);

    obj2 = obj2.incrByTen();
    System.out.println("obj2.a после второго увеличения на 10 : " + obj2.a);
  }
}
