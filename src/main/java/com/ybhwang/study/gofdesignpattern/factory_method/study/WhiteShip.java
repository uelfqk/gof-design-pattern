package com.ybhwang.study.gofdesignpattern.factory_method.study;

public class WhiteShip extends Ship {
    public WhiteShip(String name) {
        setName(name);
        setLogo("\uD83D\uDEE5");
        setColor("white");
    }
}
