package classes.callObjects;


import classes.ObjectLikeParametr.Test;

public class CallObjectsByLinkTest {
    public static void main(String[] args) {
        CallObjectsByLink ob = new CallObjectsByLink(15,20);
        System.out.println("o.a , o.b до вызова  " + ob.a +" "+ ob.b);

        ob.meth(ob);

        System.out.println("o.a , o.b после вызова  " + ob.a +" "+ ob.b);
    }
}
