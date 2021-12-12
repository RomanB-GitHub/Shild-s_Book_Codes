// в этой программе применяется метод с параметрами

public class Box3 {

  double width;
  double height;
  double depth;

  //расчитать и возвратить обьем
  double volume() {
    return width * height * depth;
  }

  // установить размеры параллелепипеда
  void setDim(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
}

class BoxDemo5 {

  public static void main(String args[]) {
    Box3 myBox1 = new Box3();
    Box3 myBox2 = new Box3();
    double vol;

    //инициализировать каждий экземпляр класса Box
    myBox1.setDim(10, 20, 15);
    myBox2.setDim(3, 6, 9);

    //Обьем первого параллелепипеда
    vol = myBox1.volume();
    System.out.println("Обьем равен : " + vol);

    //Обьем второго паралелепипеда
    vol = myBox2.volume();
    System.out.println("Обьем равен : " + vol);
  }
}
