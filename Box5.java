/* В даном примере програмы для инициализации размеров
параллелепипеда в классе Box применяется параметизированый
конструктор
 */

public class Box5 {

  double width;
  double height;
  double depth;

  // конструктор класса Box
  Box5(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // расчитать и возвратить обьем
  double volume() {
    return width * height * depth;
  }
}

class BoxDemo7 {

  public static void main(String [] args) {
    //обьявить, выделить память, инициализировать
    //обьекты класса Box5
    Box5 myBox1 = new Box5(10, 20, 15);
    Box5 myBox2 = new Box5(3, 6, 9);

    double vol;

    // получить обьем первого параллелепипеда
    vol = myBox1.volume();
    System.out.println("Обьем равен : " + vol);

    // получить обьем второго параллелепипеда
    vol = myBox2.volume();
    System.out.println("Обьем равен : " + vol);
  }
}
