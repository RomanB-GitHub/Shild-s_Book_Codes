package classes.callObjects;

//обьекты передаются по ссылке на них

import classes.ObjectLikeParametr.Test;

public class CallObjectsByLink {
    int a,b;

    CallObjectsByLink(int i, int j ){
        a = i;
        b = j;
    }
    // передать обьект

    void meth (CallObjectsByLink o){

        o.a *=2;
        o.b /= 2;
    }
}
