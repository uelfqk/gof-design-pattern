package com.ybhwang.study.gofdesignpattern.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    // TODO 싱글톤 패턴 - 멀티스레드에 대한 방어하기2
    //      객체 생성비용이 비싸지 않다면 instance 필드를 미리 초기화한 뒤 반환해도
    //      멀티스레드 환경에서 안전하게 동일성을 보장하는 객체를 반환할 수 있다.
    //      단, 이 객체를 미리 생성해두고 사용하지 않는 경우에는 자원을 낭비하는 결과만 남을 수 있다.
    public static EagerSingleton getInstance() {
        return instance;
    }
}
