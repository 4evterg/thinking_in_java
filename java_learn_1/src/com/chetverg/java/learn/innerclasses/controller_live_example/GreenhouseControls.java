package com.chetverg.java.learn.innerclasses.controller_live_example;

import com.chetverg.java.learn.innerclasses.controller.Controller;
import com.chetverg.java.learn.innerclasses.controller.Event;

/**
 * Created by chetverg on 18.04.17.
 */
public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            light = true;
        }
        public String toString(){
            return "Lights on!";
        }
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            light = false;
        }
        public String toString(){
            return "Lights off!";
        }
    }


    public boolean water = false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            water = true;
        }
        public String toString(){
            return "Water on!";
        }
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            water = false;
        }
        public String toString(){
            return "Water off!";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            thermostat = "Night";
        }
        public String toString(){
            return "Night mode!";
        }
    }
    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            thermostat = "Day";
        }
        public String toString(){
            return "Day mode!";
        }
    }

    //Пример метода action(), вставляющего
    //самого себя в список событий
    public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString(){
            return "Don!";
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e: eventList){
                addEvent(e);
            }
        }
        // можем добавить рестарт в список событий
        // чтобы система регулярно перезапускалась
        @Override
        public void action() {
            for (Event e: eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString(){
            return "System Reboot";
        }
    }
    public class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            System.exit(0);
        }
        public String toString(){
            return "Shutdown!";
        }
    }
}
