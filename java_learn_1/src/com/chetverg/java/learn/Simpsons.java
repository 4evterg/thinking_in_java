package com.chetverg.java.learn;

import java.util.Random;

import static com.chetverg.java.learn.Print.print;

/**
 * Created by chetverg on 20.11.16.
 */
abstract class Simpsons{
    int i = 9;
    abstract void sayMyName();
    abstract void sayFullClass();
}

interface Family{
    void printDoh();
}

class Homer extends Simpsons{
    static int i = 0;
    @Override
    public void sayMyName(){
        print("My name is "+ getClass().getSimpleName());
    }
    @Override
    public void sayFullClass() {
        print("Full class is " + this);
    }

    Homer(){
        i++;
        print("Homer Constructor " + i);
    }
    public void printDoh(){
        print("i'm Homer, doh!");
    }
}

class Bart extends Homer implements Family{
    static int i = 0;
    Bart(){
        i++;
        print("Bart Constructor " +i);
    }
    public void printDoh(){
        print("i'm Bart, doh!");
    }
    @Override
    public void sayMyName(){
        print("My name is "+ getClass().getSimpleName());
    }
}

class Lisa extends Homer implements Family{
    static int i = 0;
    Lisa(){
        i++;
        print("Lisa Constructor " + i);}
    public void printDoh(){ print("i'm Lisa, doh!");}
    @Override
    public void sayMyName(){
        print("My name is "+ getClass().getSimpleName());
    }
}

class GenSimpsons{
    Random rnd = new Random();
    public Simpsons generate(){
        switch (rnd.nextInt(3)){
            case 0: return new Lisa();
            case 1: return new Bart();
            default: return new Homer();
        }
    }
}