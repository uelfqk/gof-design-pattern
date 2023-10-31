package com.ybhwang.study.gofdesignpattern.factory_method;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip(name);
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip(String name);

    default void sendEmailTo(String email, Ship ship) {
        System.out.println("to " + email + " " + ship.getName() + " 다 만들었습니다.");
    }

    default void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    default void validate(String name, String email) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
    }
}
