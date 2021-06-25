package classes.ObjectCloning;

public class OverloadConst2 {
    public static void main(String[] args) {
        //создаем параллелепипеды используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        //  создать копию обьекта mybox1
        double vol;

        // Получить обьем первого паралелепипеда
        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);

        // Получить обьем второго паралелепипеда
        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен " + vol);

        // Получить обьем куба
        vol = mycube.volume();
        System.out.println("Обьем mycube равен " + vol);

        // Получить обьем клона
        vol = myclone.volume();
        System.out.println("Обьем myclone равен " + vol);

    }
}
