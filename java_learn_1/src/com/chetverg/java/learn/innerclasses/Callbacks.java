package com.chetverg.java.learn.innerclasses;

import static com.chetverg.java.learn.Print.print;

/**
 * Created by chetverg on 05.04.17.
 */

interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{
    private int i = 0;
    @Override
    public void increment() {
        i++;
        print(i);
    }
}

class MyIncrement{
    public void increment(){
        print("different operation");
    }
    public static void f(MyIncrement mi){
        mi.increment();
    }
}

class Callee2 extends MyIncrement{
    private int i = 0;
    public void increment(){
        super.increment();
        i++;
        print(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment(); // собственно замыкание, вернее его использование.
        }                             // Т.к. содержит ссылку на внешний объект, на "контекст"
    }
    Incrementable getCallBackReference(){
        return new Closure();
    }
}


// А вот и колбек. Передаем линк на инкриметебл, а класс вызывает его метод
class Caller{
    private Incrementable callBackReference;
    Caller(Incrementable cbh){ callBackReference = cbh;}
    void go(){ callBackReference.increment(); }
}


public class Callbacks {
    public static class Tester{
        public static void main(String[] args) {
            Callee1 c1 = new Callee1();
            Callee2 c2 = new Callee2();
            MyIncrement.f(c2);
            Caller caller1 = new Caller(c1);
            Caller caller2 = new Caller(c2.getCallBackReference());
            caller1.go();
            caller1.go();
            caller2.go();
            caller2.go();
        }
    }
}
