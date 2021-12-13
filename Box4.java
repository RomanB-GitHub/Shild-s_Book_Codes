public class Box4 {

  double width;
  double height;
  double depth;

  // расчитать и возвратить обьем
  double volume() {
    return width * height * depth;
  }

  // это конструктор класса Box
  Box4() {
    System.out.println("Конструирование обьекта Box");
    width = 10;
    height = 10;
    depth = 10;
  }
}

class BoxDemo6 {

  public static void main(String[] args) {

    //обьявить, виделить память и инициализироватть обьэкты типа Box
    Box4 myBox1 = new Box4();
    Box4 myBox2 = new Box4();

    double vol;

    //получить обьем первого параллелепипеда
    vol = myBox1.volume();
    System.out.println("Обьем равен : " + vol);

    //получить обьем второго параллелепипеда
    vol = myBox2.volume();
    System.out.println("Обьем равен : " + vol);
  }
}
