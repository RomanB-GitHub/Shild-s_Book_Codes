package classes.differentReturningObject;

public class RetObj {
    int a;

    RetObj(int i) {
        a = i;
    }

    RetObj incrByTen() {
        RetObj temp = new RetObj(a + 10);
        return temp;
    }


}
