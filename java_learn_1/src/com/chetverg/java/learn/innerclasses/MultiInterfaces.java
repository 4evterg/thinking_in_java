package com.chetverg.java.learn.innerclasses;

/**
 * Created by chetverg on 04.04.17.
 */
interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
    B makeB(){
        return new B(){};
    }
}

public class MultiInterfaces {
    static void takesA(A a){}
    static void takesB(B b){}
    static class Tester{
        public static void main(String[] args) {
            X x = new X();
            Y y = new Y();
            takesA(x);
            takesA(y);
            takesB(x);
            takesB(y.makeB());
        }
    }
}
