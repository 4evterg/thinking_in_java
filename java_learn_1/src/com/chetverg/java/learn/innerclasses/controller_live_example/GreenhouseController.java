package com.chetverg.java.learn.innerclasses.controller_live_example;

import com.chetverg.java.learn.innerclasses.controller.Event;

/**
 * Created by chetverg on 18.04.17.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event [] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1){
           gc.addEvent(
                   gc.new Terminate(new Integer(args[0]))
           );
        }
        gc.run();
    }
}
