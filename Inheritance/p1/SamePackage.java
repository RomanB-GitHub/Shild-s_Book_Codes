package Inheritance.p1;

public class SamePackage {
SamePackage(){
  Protection p = new Protection();
  System.out.println("Конструктор подкласса SamePakage из того же пакета");

  System.out.println("n = " + p.n);
  System.out.println(("n_pro = " + p.n_pro));
  System.out.println("n_pub = " + p.n_pub);
 // System.out.println("n_pri = " + p.n_priv);// // Доступно только для класса в котором обьявлено

}
}
