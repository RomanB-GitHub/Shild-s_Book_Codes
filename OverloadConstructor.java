/* в даном конструкторы определяются
в классе OverloadConstructor тремя
разными способами
 */

public class OverloadConstructor {

  double width;
  double height;
  double depth;

  // конструктор используемый когда указаны все размеры
  OverloadConstructor(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // конструктор, используемый когда
  // ни один из размеров не указан
  OverloadConstructor() {
    width = -1;
    height = -1;
    depth = -1;
  }

  //конструктор, ипользуемый при
  // создании куба
  OverloadConstructor(double len) {
    width = height = depth = len;
  }

  double volume() {
    return width * height * depth;
  }
}

class OverloadConstructorTest {

  public static void main(String[] args) {
    OverloadConstructor myBox1 = new OverloadConstructor(10, 20, 15);
    OverloadConstructor myBox2 = new OverloadConstructor();
    OverloadConstructor myCube = new OverloadConstructor(7);
    double vol;

    // получить обьем первого параллелепипеда
    vol = myBox1.volume();
    System.out.println("Обьем myBox1 равен : " + vol);
    // получить обьем второго параллелепипеда
    vol = myBox2.volume();
    System.out.println("Обьем myBox2 равен : " + vol);
    // получить обьем куба
    vol = myCube.volume();
    System.out.println("Обьем myCube равен : " + vol);
  }
}
