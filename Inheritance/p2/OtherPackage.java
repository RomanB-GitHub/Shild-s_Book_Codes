package Inheritance.p2;

import Inheritance.p1.Protection;

public class OtherPackage {
  OtherPackage(){
    Inheritance.p1.Protection p = new Protection();
    System.out.println("Конструктор из другого пакета OtherPackage");

    // Доступно для даного класса или пакета
    //System.out.println("n  =" + p.n);

    // Доступно только для даного класса, подкласса и  пакета
    //System.out.println("n_pro =" + p.n_pro);

    //Доступно только для данного класса
    //System.out.println("n_pri =" + p.n_pri);

    System.out.println("n_pub = " + p.n_pub);
  }

}
