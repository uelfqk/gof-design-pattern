package com.ybhwang.study.gofdesignpattern.singleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {

    }

    // TODO 싱글톤 패턴 - 멀티스레드에 대한 방어하기3
    //      getInstance 메소드가 호출될때 instance 가 null 인지 판단하고
    //      동기화 작업을 실행해 다른 스레드가 접근하지 못하는 상태에서 객체를 생성하고 반환한다.
    //      비슷한 시기에 다른 스레드에서 접근해도 동기화 작업으로 대기 상태가 되며 2번의 null 체크로
    //      instance 에 동일성을 보장한다.
    //      getInstance 메소드를 호출할때마다 매번 synchronized 블록을 호출하지 않음으로
    //      성능상 이점을 얻을 수 있다.
    public static DoubleCheckedLockingSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return instance;
    }
}
