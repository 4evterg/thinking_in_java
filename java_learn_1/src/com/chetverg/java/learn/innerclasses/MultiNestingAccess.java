package com.chetverg.java.learn.innerclasses;

import static com.chetverg.java.learn.Print.print;

/**
 * Created by chetverg on 03.04.17.
 */

class MNA{
    private void a(){
        print("first level");
    }
    class A{
        private void b(){
            print("second level");
        }
        public class B{
            void c(){
                a();
                b();
            }

        }
    }
}

public class MultiNestingAccess {
    public static class Tester{
        public static void main(String[] args) {
            MNA mna = new MNA();
            MNA.A mnaa = mna.new A();
            MNA.A.B mnaab = mnaa.new B();
            mnaab.c();
        }
    }
}
