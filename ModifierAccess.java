// в этой программе демонстрируется отличие
// модификаторов public  и private
public class ModifierAccess {

  int a;          //по умолчанию default
  public int b;   //открытый доступ
  private int c;  //закрытый доступ

  //методы доступа к члену "с" даного класса
  void setc(int i) {

    //установить значение члена "с" с даного класса
    c = i;
  }

  int getc() {
    // получить значение "с" даного класса
    return c;
  }
}

class AccessTest {

  public static void main(String [] args) {
    ModifierAccess ob = new ModifierAccess();

    //Эти операторы правильны, поэтому члены a и b
    //даного класса доступны непосредственно
    ob.a = 10;
    ob.b = 20;

    //этот оператор не верен и может вызвать ошибку
    // ob.c = 100; // ошибка!!!

    // доступ к "с" должен осуществляться с помошью
    //методов его класса
    ob.setc(100); // верно!!!

    System.out.println("а и b и с : " + ob.a +" " + ob.b + " "+ ob.getc());
  }
}
