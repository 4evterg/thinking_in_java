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
        Pacel pacel = new Pacel();
        Contents contents = pacel.contents();
        Destination destination = pacel.destination("Taskan");

        Pacel2 pacel2 = new Pacel2();
        Destination d = pacel2.dest("Crymea");
        
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
    public Destination dest(String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
                print(label);
            }
            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }
}





