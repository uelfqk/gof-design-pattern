package com.ybhwang.study.gofdesignpattern.factory_method;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }
}
