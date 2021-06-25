package classes.overloadingConstructor;

public class BoxTest {
    public static void main(String[] args) {
        // Создать паралелепипед используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //Получить обьем первого паралелепипеда
        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен : " + vol);

        //получить обьем второго паралелепипеда
        vol = mybox2.volume();
        System.out.println("Обьем mybox2  равен : " + vol);

        //получить обьем куба
        vol = mycube.volume();
        System.out.println("Обьем mycube равен : " + vol);
    }
}
