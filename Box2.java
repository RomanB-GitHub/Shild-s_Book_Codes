//теперь метод volume() будет возвращать обьем паралелепипеда

public class Box2 {

  double width;
  double height;
  double depth;

  double volume() {
    return width * height * depth;
  }
}

class BoxDemo4 {

  public static void main(String args[]) {
    Box2 myBox1 = new Box2();
    Box2 myBox2 = new Box2();
    double vol;

    myBox1.width = 10;
    myBox1.height = 20;
    myBox1.depth = 15;

    myBox2.width = 3;
    myBox2.height= 6;
    myBox2.depth= 9;
    //расчитать обьем первого параллелепипеда
    vol = myBox1.volume();
    System.out.println("Обьем равен : " + vol);
    //расчитать обьем второго параллелепипеда
    vol = myBox2.volume();
    System.out.println("Обьем равен : " + vol);
  }
}
