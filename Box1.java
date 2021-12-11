public class Box1 {

  double width;
  double height;
  double depth;

  // вывести обьем паралелепипеда
  void voluem() {
    System.out.print(" Обьем равен : ");
    System.out.println(width * height * depth);
  }

}

class BoxDemo3 {

  public static void main(String args[]) {
    Box1 myBox1 = new Box1();
    Box1 myBox2 = new Box1();

    // присвоить значения переменным экземпляра myBox1
    myBox1.width = 10;
    myBox1.height = 20;
    myBox1.depth = 15;

    /* присвоить значения переменным
       экземпляра myBox2
     */

    myBox2.width = 3;
    myBox2.height = 6;
    myBox2.depth = 9;

    //вывести значение voluem для myBox1
    myBox1.voluem();

    //вывести значение voluem для myBox2
    myBox2.voluem();

  }
}
