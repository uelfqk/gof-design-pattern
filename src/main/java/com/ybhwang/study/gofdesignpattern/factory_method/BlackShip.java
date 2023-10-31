package com.ybhwang.study.gofdesignpattern.factory_method;

public class BlackShip extends Ship {
    public BlackShip(String name) {
        setName(name);
        setLogo("닷");
        setColor("black");
    }
}
