package com.bear;

import com.bear.bears.Bear;
import com.bear.bears.CrankyBear;
import com.bear.bears.DrunkBear;
import com.bear.bears.SimpleBear;

public class Shop {
    private int producedBears;
    private String name;

    public Shop(String name){
        this.name=name;
    }

    public Bear createBear(){
        producedBears++;
        if(producedBears%2==0){
            return new SimpleBear();
        }
        if (producedBears%5==0){
            return new CrankyBear();
        }
        return new DrunkBear();
    }



    public void produceAndTestBatch(int batch){

        Bear bearsShop[]=new Bear[batch];
        System.out.println("Producing and testing at shop: " + this.name);
        for (int i = 0; i <batch; i++) {
            bearsShop[i]= this.createBear();
            System.out.println(bearsShop[i].getType());

            for (int j = 0; j <= 11; j++) {
                bearsShop[i].talk();
                if(bearsShop[i].getType().equals("I'm a Drunk Bear")){
                    ((DrunkBear) bearsShop[i]).rechargeBattery();
                }

            }
        }

    }

    public Shop compareWithShop(Shop shop){
        if(producedBears==shop.producedBears){
            return null;
        }
        if (producedBears > shop.producedBears){
            return this;
        }
        return shop;
    }


    public String getName() {
        return name;
    }
}
