package com.chetverg.java.learn.innerclasses;

import static com.chetverg.java.learn.Print.print;

/**
 * Created by chetverg on 23.04.17.
 */

class OverrideFrom{
    protected class Yolk{
        public Yolk(){
            print("OverrideFrom.Yolk()");
        }
        public void f(){
            print("OverrideFrom.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();
    public OverrideFrom(){
        print("New OverrideFrom()");
    }
    public void insertYolk(Yolk yy){
        this.y = yy;
    }
    public void g(){
        y.f();
    }
}

public class Override extends OverrideFrom{
    public class Yolk extends OverrideFrom.Yolk{
        public Yolk(){
            print("Override.Yolk");
        }
        public void f(){
            print("Override.Yolk.f()");
        }
    }
    public Override(){
        insertYolk(new Yolk());
    }
    public static void main(String[] args) {
        OverrideFrom of = new Override();
        of.g();
    }
}

