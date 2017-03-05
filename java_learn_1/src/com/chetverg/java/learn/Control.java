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
 * @version <b>1.7<b/>
 *
 */
public class Control{

    Control(){
        print("Control Constructor");
    }

    public static void main(String[] args)
    {

    }
}




class A{
    private interface B{
        void f();
    }
    class Bimp implements B{
        public void f(){}
    }
    Bimp getBimp(){
        return new Bimp();
    }
    private B bRef;
    public void reciveB(B b){
        bRef = b;
        bRef.f();
    }

    public void f() {
        getBimp().f();
    }
}

class Test{
    void f(){
        A a = new A();
        A.Bimp ab = a.getBimp();
        a.reciveB(ab);
    }
}


class ClintonAdapter extends Simpsons{
    Clinton clinton;

    ClintonAdapter(Clinton clinton){
        this.clinton = clinton;
    }

    public void sayMyName(){
        clinton.sayMyName();
    }
    public void sayFullClass(){
        clinton.sayFullClass();
    }

}



