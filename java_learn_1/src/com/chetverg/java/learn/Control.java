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
        Pacel2 pacel = new Pacel2();
        Contents c = Pacel2.contents();
        Destination d = Pacel2.destination("Alch");
        print(d.readLabel());
        print(c.value());
    }
}

interface Destination{
    String readLabel();
}
interface Contents{
    int value();
}

class Pacel{
    private class PContents implements Contents{
        int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected class PDestination implements Destination{
        private String label;
        PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }

}

class Pacel2{
    private static class Pcontents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
        public static void f(){} //чисто дпя примера статик метода в влож-м классе
        static int x = 10; // пример статик поля
        static class AnotherLevel{ //пример статик класса во вложенном
            public static void f(){}
            static int x = 11;
        }
    }
    public static Destination destination(String s){
        return new ParcelDestination(s);
    }
    public static Contents contents(){
        return new Pcontents();
    }
}





