//Обьекты допускаетьлся передавать методом в качестве параметров

public class ObjectLikeParametr {

  int a, b;

  ObjectLikeParametr(int i, int j) {
    a = i;
    b = j;
  }

  //возвратить логическое значение true
  // если в качестве параметра  "о" указан
  // вызывающий обьект
  boolean equalTo(ObjectLikeParametr o) {
    if (o.a == a && o.b == b) {
      return true;
    } else {
      return false;
    }
  }
}

class ObjectLikeParametrTest {

  public static void main(String[] args) {
    ObjectLikeParametr ob1 = new ObjectLikeParametr(100, 22);
    ObjectLikeParametr ob2 = new ObjectLikeParametr(100, 22);
    ObjectLikeParametr ob3 = new ObjectLikeParametr(-1, -1);

    System.out.println("ob1 = ob2 : " + ob1.equalTo(ob2));
    System.out.println("ob1 = ob3 : " + ob1.equalTo(ob3));
  }
}
