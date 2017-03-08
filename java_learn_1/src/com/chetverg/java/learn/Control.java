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

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args)
    {
        serviceConsumer(new Imp1Factory());
        serviceConsumer(new Imp2Factory());
    }
}

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Imp1 implements Service{
    @Override
    public void method1() {
        print("Implementation1 method1");
    }

    @Override
    public void method2() {
        print("Implementation1 method2");
    }
}

class Imp1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Imp1();
    }
}



class Imp2 implements Service{
    @Override
    public void method1() {
        print("Implementation2 method1");
    }

    @Override
    public void method2() {
        print("Implementation2 method2");
    }
}

class Imp2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Imp2();
    }
}







