/*
Smart Home Automation System
-> if motion is detected ->Light on
-> if temp>30 degree -> turn on AC
-> At 7pm ->light on
it should support
->multiple types of devices
->easy addition of new devices and rules in future

Devices → Light, AC
Triggers → Motion, Temperature, Time
Rules → “IF condition → DO action”

Interface → Device (abstraction)
Interface → Trigger
Rule class → connects trigger + action

*/
package day_9;

abstract class Smart_Device {
    String name;
    Smart_Device(String name) {
        this.name = name;
    }
    abstract void turnOn();
    abstract void turnOff();
}

class Lamp extends Smart_Device {
    Lamp(String name) {
        super(name);
    }
    void turnOn() {
        System.out.println(name + ":TURN ON");
    }
    void turnOff() {
        System.out.println(name + ":TURN OFF");
    }
}

class AC extends Smart_Device {
    AC(String name) {
        super(name);
    }
    void turnOn() {
        System.out.println(name + ":TURN ON");
    }
    void turnOff() {
        System.out.println(name + ":TURN OFF");
    }
}

interface Trigger {
    boolean check();  
}

class MotionTrigger implements Trigger {
    boolean motionDetected;
    MotionTrigger(boolean motionDetected) {
        this.motionDetected = motionDetected;
    }
    public boolean check() {
        return motionDetected;
    }
}

class TempTrigger implements Trigger {
    int temperature;
    TempTrigger(int temperature) {
        this.temperature = temperature;
    }
    public boolean check() {
        return temperature > 30; 
    }
}

class TimeTrigger implements Trigger {
    int hour;
    TimeTrigger(int hour) {
        this.hour = hour;
    }
    public boolean check() {
        return hour == 19; // 7 PM
    }
}

interface Action {
    void execute();
}

class TurnOn implements Action {
    Smart_Device device;
    TurnOn(Smart_Device device) {
        this.device = device;
    }
    public void execute() {
        device.turnOn();
    }
}

class TurnOff implements Action {
    Smart_Device device;
    TurnOff(Smart_Device device) {
        this.device = device;
    }
    public void execute() {
        device.turnOff();
    }
}

class Rule {
    Trigger trigger;
    Action action;
    Rule(Trigger trigger, Action action) {
        this.trigger = trigger;
        this.action = action;
    }
    void executeRule() {
        if (trigger.check()) {
            action.execute();   
        }
    }
}

public class task {
    public static void main(String[] args) {
        Smart_Device light = new Lamp("Living Room Light");
        Smart_Device ac = new AC("Bedroom AC");

        Trigger motion = new MotionTrigger(true);   
        Trigger temp = new TempTrigger(25);       
        Trigger time = new TimeTrigger(7);       

        Action lightOn = new TurnOn(light);
        Action acOn = new TurnOn(ac);

        Rule r1 = new Rule(motion, lightOn); 
        Rule r2 = new Rule(temp, acOn);      
        Rule r3 = new Rule(time, lightOn);   

        r1.executeRule();
        r2.executeRule();
        r3.executeRule();
    }
}