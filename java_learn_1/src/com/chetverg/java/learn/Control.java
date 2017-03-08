package com.chetverg.java.learn;
import static com.chetverg.java.learn.Print.*;
import static com.sun.xml.internal.stream.Entity.ScannedEntity.DEFAULT_BUFFER_SIZE;

import com.chetverg.java.learn.Simpsons;


import com.chetverg.java.learn_2.*;
import com.sun.org.apache.xalan.internal.xsltc.trax.SmartTransformerFactoryImpl;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;
//import java.util.ArrayList;

/**
 * @author <b>4evterg<b/>
 * @version <b>24.7<b/>
 *
 */
public class Control{
    Control(){
        print("Control Constructor");
    }

    public static void main(String[] args)
    {

        Sequence sequence = new Sequence(10);
        for (int i = 0; i<10; i++) {
            sequence.add(i);
        }
            Selector selector = sequence.getSelector();
            while (!selector.end()){
                print(selector.current() + " ");
                selector.next();
            }
        }
    }

interface Selector{
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
        print("Sequence Constructor");
    }
    public void add(Object x){
        if (next < items.length){
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i<items.length){
                i++;
            }
        }
    }
    public Selector getSelector(){
        return new SequenceSelector();
    }
}






