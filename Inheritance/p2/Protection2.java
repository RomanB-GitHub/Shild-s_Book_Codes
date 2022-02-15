package Inheritance.p2;

class Protection2 extends Inheritance.p1.Protection {

  Protection2() {
    System.out.println("Конструктор унаследованый из другого пакета Protection2");
    //Доступно только для даного класса или пакета в котором обьявлено
    // System.out.println("n = " + n);

    System.out.println("n_pro = " + n_pro);
    System.out.println("n_pub = " + n_pub);

    //Доступно только для даного класса в котором обьявлено
    // System.out.println("n_pri = " + n_pri);

  }
}
