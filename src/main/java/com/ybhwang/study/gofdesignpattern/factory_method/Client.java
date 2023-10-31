package com.ybhwang.study.gofdesignpattern.factory_method;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = DefaultShipFactory.orderShip("whiteShip", "uelfqk@gmail.com");
        System.out.println(whiteShip);

        Ship blackShip = DefaultShipFactory.orderShip("blackShip", "uelfqk@gmail.com");
        System.out.println(blackShip);
    }
}
