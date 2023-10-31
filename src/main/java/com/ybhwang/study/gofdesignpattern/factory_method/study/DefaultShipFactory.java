package com.ybhwang.study.gofdesignpattern.factory_method.study;

public class DefaultShipFactory {

    public static Ship orderShip(String name, String email) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if(name.equalsIgnoreCase("whiteShip")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if(name.equalsIgnoreCase("blackShip")) {
            ship.setLogo("닷");
        }

        if(name.equalsIgnoreCase("whiteShip")) {
            ship.setColor("white");
        } else if(name.equalsIgnoreCase("blackShip")) {
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println("to " + email + " " + ship.getName() + " 다 만들었습니다.");
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}
