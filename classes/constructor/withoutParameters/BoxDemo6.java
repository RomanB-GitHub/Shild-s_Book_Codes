package classes.constructor.withoutParameters;

public class BoxDemo6 {

    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        //mybox1
        vol = mybox1.volume();
        System.out.println("Обьем  mybox1 " + vol);

        //mybox2
        vol = mybox1.volume();
        System.out.println("Обьем  mybox2 " + vol);

    }
}
