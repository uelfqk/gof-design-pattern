package com.ybhwang.study.gofdesignpattern.factory_method;

import com.ybhwang.study.gofdesignpattern.factory_method.study.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FactoryMethodPatternTest {

    @Test
    @DisplayName(value = "팩토리 메소드 패턴을 적용하기전 배만들기 테스트")
    void defaultShipFactoryTest() {
        // given when
        Ship whiteShip = DefaultShipFactory.orderShip("whiteShip", "uelfqk@gmail.com");
        Ship blackShip = DefaultShipFactory.orderShip("blackShip", "uelfqk@gmail.com");

        // then
        Assertions.assertThat(whiteShip.getName()).isEqualTo("whiteShip");
        Assertions.assertThat(whiteShip.getLogo()).isEqualTo("\uD83D\uDEE5");
        Assertions.assertThat(whiteShip.getColor()).isEqualTo("white");

        Assertions.assertThat(blackShip.getName()).isEqualTo("blackShip");
        Assertions.assertThat(blackShip.getLogo()).isEqualTo("닷");
        Assertions.assertThat(blackShip.getColor()).isEqualTo("black");
    }

    @Test
    @DisplayName(value = "팩토리 메소드 패턴을 적용 후 배만들기 테스트")
    void whiteShipFactoryTest() {
        // given
        ShipFactory shipFactory = new WhiteShipFactory();

        // when
        Ship whiteShip = shipFactory.orderShip("whiteShip", "uelfqk@gmail.com");

        // then
        Assertions.assertThat(whiteShip.getName()).isEqualTo("whiteShip");
        Assertions.assertThat(whiteShip.getLogo()).isEqualTo("\uD83D\uDEE5");
        Assertions.assertThat(whiteShip.getColor()).isEqualTo("white");
    }

    @Test
    @DisplayName(value = "팩토리 메소드 패턴을 적용 후 배만들기 테스트")
    void blackShipFactoryTest() {
        // given
        ShipFactory shipFactory = new BlackShipFactory();

        // when
        Ship whiteShip = shipFactory.orderShip("blackShip", "uelfqk@gmail.com");

        // then
        Assertions.assertThat(whiteShip.getName()).isEqualTo("blackShip");
        Assertions.assertThat(whiteShip.getLogo()).isEqualTo("닷");
        Assertions.assertThat(whiteShip.getColor()).isEqualTo("black");
    }
}