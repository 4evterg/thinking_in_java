package com.chetverg.java.learn.innerclasses;

/**
 * Created by chetverg on 20.04.17.
 */

class WithInner{
    class Inner{}
}

public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi){
        wi.super();
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
