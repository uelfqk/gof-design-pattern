package com.ybhwang.study.gofdesignpattern.singleton;

public class LazyLoadingSingleton {

    private static class LazySingletonHolder {
        private static final LazyLoadingSingleton INSTANCE = new LazyLoadingSingleton();
    }
    private LazyLoadingSingleton() {

    }

    // TODO 싱글톤 패턴 - 멀티스레드에 대한 방어하기4
    //      싱글톤 패턴 사용시 권장하는 방법으로 getInstance 메소드가 호출될때서야
    //      홀더 클래스가 로딩이되고 홀더가 가지고 있는 인스턴스를 반환하는 방법
    //      DoubleCheckedLocking 과 같이 배경지식을 알지 못해도 사용가능하며 코드도 간단하다는 장점이 있다.
    public static synchronized LazyLoadingSingleton getInstance() {
        return LazySingletonHolder.INSTANCE;
    }
}
