package com.kremogen;

public class Products implements Priceable {
    private final String name, date;
    private final int price;

    public Products(String name, String date, int price){
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public int checkPrice() {
        return price;
    }
}
