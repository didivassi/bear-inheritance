package com.bear;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shop shop1 = new Shop("The one");
        Shop shop2= new Shop("The Bear Maker");

        shop1.produceAndTestBatch(6);
        shop2.produceAndTestBatch(3);

        Shop winner= shop1.compareWithShop(shop2);
        if(winner==null){
            System.out.println("it's a tie");
        }
        else {
            System.out.println(winner.getName());
        }


    }


}
