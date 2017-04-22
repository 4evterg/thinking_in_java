package com.chetverg.java.learn.innerclasses;

import java.lang.*;
import java.lang.Override;

import static com.chetverg.java.learn.Print.*;

/**
 * Created by chetverg on 23.04.17.
 */

interface Counter{
    int next();
}

public class LocalInner {
    private int count = 0;
    Counter getCounter(final String name){
        //local inner
        class LocalCounter implements Counter{
            public LocalCounter(){
                print("LocalCounter");
            }
            public int next(){
                printnb(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    //Same thing with noname inner
    Counter getCounter2(final String name){
        return new Counter() {
            {
                print("Counter()");
            }
            @Override
            public int next() {
                printnb(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInner li = new LocalInner();
        Counter
                c1 = li.getCounter(" local"),
                c2 = li.getCounter2(" noname");
        for (int i = 0; i<5; i++)
            print(c1.next());
        for (int i = 0; i<5; i++)
            print(c2.next());
    }
}


