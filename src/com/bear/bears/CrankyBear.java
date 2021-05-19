package com.bear.bears;

import com.bear.bears.Bear;

public class CrankyBear extends Bear {

    private boolean hasSung;

    public CrankyBear(){
        super("Cranky");
        hasSung=false;

    }

    @Override
    public void talk() {
        if(hasBattery()){
            super.talk();
            return;
        }
        if(!hasSung){
            System.out.println("I Will survive!!!");
            hasSung = true;
            super.wornOut();
        }
    }

    @Override
    protected boolean  hasBattery(){
        if(super.batteryLevel>0.5){
            return true;
        }
        return false;
    }
}
