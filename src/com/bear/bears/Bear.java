package com.bear.bears;

public class Bear {
    protected float batteryLevel;
    protected String type;
    float wornForTalking=0.1f;
    boolean isWornOut;

    public Bear(String type){
        batteryLevel=1;
        this.type=type;
        isWornOut=false;
    }

    public void talk(){
        wornOut();
        if(hasBattery()){
            System.out.println("I Love You");
            return;
        }
        System.out.println("Out of battery");
    }


    protected void wornOut(){
        batteryLevel  -= hasBattery() ? wornForTalking:0;
    }

    protected boolean hasBattery(){
        return batteryLevel>0;
    }

    public String getType() {//not used
        return "I'm a " + type;
    }
}
