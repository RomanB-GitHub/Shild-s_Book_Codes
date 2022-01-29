// Динамическая диспетчиризация методов

public class DispatcherizationA {

  void callMe() {
    System.out.println("Вызов метода callMe() из класса A ");
  }
}

class DispatcherizationB extends DispatcherizationA {

  void callMe() {
    System.out.println("Вызов метода callMe() из класса B ");
  }
}

class DispatcherizationC extends DispatcherizationA {

  void callMe() {
    System.out.println("Вызов метода callMe() из класса C ");
  }
}

class Dispatch {

  public static void main(String[] args) {
    DispatcherizationA a = new DispatcherizationA();//обьект класса А
    DispatcherizationB b = new DispatcherizationB();//обьект класса B
    DispatcherizationC c = new DispatcherizationC();//обьект класса C

    DispatcherizationA r; //  получить ссылку на обьект A

    r = a;// перременная типа r ссылается на обьект типа A
    r.callMe(); // вызвать вариант метода callMe из класса A

    r = b; //перременная типа r ссылается на обьект типа B
    r.callMe(); // вызвать вариант метода callMe из класса B

    r = c; //перременная типа r ссылается на обьект типа C
    r.callMe(); //вызвать вариант метода callMe из класса C
  }
}
