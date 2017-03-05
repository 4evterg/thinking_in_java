package com.chetverg.java.learn;
import java.util.Random;

import static com.chetverg.java.learn.Print.print;
/**
 * Created by chetverg on 20.11.16.
 */
interface Clinton {
    public static final int TEST_CONST = 1;
    void sayMyName();
    void sayFullClass();
}

class  Hillary implements Clinton{
    static int i = 0;

    int key = TEST_CONST;

    Hillary(){
        i++;
        print("Hillary Constructor " +i);
    }

    @Override
    public void sayMyName() {
        print("My name is "+ getClass().getSimpleName());
    }

    @Override
    public void sayFullClass() {
        print("Full class is "+ this);
    }
}

class Bill implements Clinton{
    static int i = 0;

    Bill(){
        i++;
        print("Bill Constructor " +i);
    }

    @Override
    public void sayMyName() {
        print("My name is "+ getClass().getSimpleName());
    }

    @Override
    public void sayFullClass() {
        print("Full class is "+ this);
    }
}


class GenClintons{
    Random rnd = new Random();
    public Clinton generate(){
        switch (rnd.nextInt(2)){
            case 0: return new Hillary();
            default: return new Bill();
        }
    }
}