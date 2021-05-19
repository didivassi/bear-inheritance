package com.bear.bears;

//se adormeceu metodo publico recharge
public class DrunkBear extends Bear {

    private float sleepProbability;
    private boolean hasSlept;

    public DrunkBear(){
        super("Drunk Bear");
        sleepProbability=0.2f;
        hasSlept =false;
    }

    @Override
    public void talk(){
        if(fallAsleep() && hasBattery()){
            System.out.println("ZZZzzzzZZ ZZZzzzz. Grunf Grunf");
            super.wornOut();
            return;
        }
        super.talk();
    }

    private boolean fallAsleep(){
        float oddsSleeping=(float) Math.random();
        if(oddsSleeping<=sleepProbability){
            hasSlept =true;
            return true;
        }
        return false;
    }

    public void rechargeBattery(){
        if(hasSlept){
            super.batteryLevel=1f;
            hasSlept =false;
            System.out.println("I've just Recharged due to my nap");
            return;
        }
        System.out.println("I need to sleep first to recharge");

    }
}
