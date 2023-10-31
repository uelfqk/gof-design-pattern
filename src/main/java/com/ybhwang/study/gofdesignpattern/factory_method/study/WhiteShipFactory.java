package com.ybhwang.study.gofdesignpattern.factory_method.study;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name) {
        return new WhiteShip(name);
    }
}
