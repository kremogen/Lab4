package com.kremogen;

public class Main {
    public static void main(String[] args) {
        Products firstProduct = new Products("Cola", "07.08.2021", 50);
        System.out.print("Товар: " + firstProduct.getName() + "\nДата: " + firstProduct.getDate() + "\nЦена: " + firstProduct.checkPrice() + " руб.");
    }
}
