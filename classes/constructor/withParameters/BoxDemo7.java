package classes.constructor.withParameters;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10,20,15);
        Box7 mybox2 = new Box7(3,6,9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume2 : " + vol);

        vol = mybox2.volume();
        System.out.println("Volume2 : " + vol);
    }
}
