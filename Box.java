public class Box {

  double weight;
  double height;
  double depth;

}

class BoxDemo2 {

  public static void main(String args[]) {
    Box myBox1 = new Box();
    Box myBox2 = new Box();
    double vol;

    //присвоим значения первому параллелепипеду
    myBox1.weight = 10;
    myBox1.height = 20;
    myBox1.depth = 15;

    //* присвоить значения второму параллелепипеду
    myBox2.weight = 3;
    myBox2.height = 6;
    myBox2.depth = 9;

    //расчитать обьем первого параллелепипеда
    vol = myBox1.weight * myBox1.height * myBox1.depth;
    System.out.println("Обьем первого параллелепипед : " + vol);

    //расчитать обьем второго параллелепипеда
    vol = myBox2.weight * myBox2.height * myBox2.depth;
    System.out.println("Обьем первого параллелепипед : " + vol);
  }

}
