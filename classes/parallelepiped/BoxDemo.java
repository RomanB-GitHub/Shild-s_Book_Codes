package classes.parallelepiped;

// в этом классе обьявляется обьект типа BOX
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным экземпляра mybox

        mybox1.depth = 15;
        mybox1.width = 10;
        mybox1.height = 20;

        // присвоить значения переменным экземпляра mybox2

        mybox2.depth = 9;
        mybox2.width = 3;
        mybox2.height = 6;

        // расчитать обьем паралелепипеда

        vol = mybox1.width * mybox1.depth * mybox1.height;
        System.out.println("Обьем mybox1 равен :" + vol);

        vol = mybox2.width * mybox2.depth * mybox2.height;
        System.out.println("Обьем mybox2 равен :" + vol);
    }
}
