package com.chetverg.java.learn.innerclasses.controller;

/**
 * Created by chetverg on 13.04.17.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }

    protected void start(){
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
