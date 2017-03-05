package com.chetverg.java.learn_2;

import static com.chetverg.java.learn.Print.print;

/**
 * Created by chetverg on 30.10.16.
 */
public class Cookie {
    static int count = 0;
    private Cookie(){
        print("number of Cookies: " + count + " " + this);

    }
    public static Cookie makeAcookie(){
        count++;
        if (count<3) {
            return new Cookie();
        }
        else{
            return null;
        }
    }
    public void f(){
        print("hello hello hello");
    }

    /**
     * @return info about class
     * */
    public String toString(){
        return "goodbye goodbye goodbye";
    }

}

class Test{

}
