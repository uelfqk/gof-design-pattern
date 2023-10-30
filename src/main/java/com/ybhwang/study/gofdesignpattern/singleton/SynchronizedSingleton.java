package com.ybhwang.study.gofdesignpattern.singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {

    }

    // TODO 싱글톤 패턴 - 멀티스레드에 대한 방어하기1
    //      synchronized 키워드를 사용해 getInstance 메소드가 호출될때
    //      동기화 작업을 통해 instance 에 동일성을 보장한다.
    //      ----------------------------------------------------------------------------------------------
    //      동기화 작업
    //      ----------------------------------------------------------------------------------------------
    //      메소드 단위 코드 블록에 대해 한개의 스레드만 접근을 허용하도록 락(lock)을 실행해
    //      다른 스레드의 접근을 막고 코드 블록이 모두 실행되면 해제(unlock) 으로 다음 스레드의 접근을 허용)
    //      ----------------------------------------------------------------------------------------------
    //      단, getInstance 메소드가 호출 될때 마다 위와 같은 동기화 작업이 발생함으로 성능상 부하가 발생할 확률이 높다.
    public static synchronized SynchronizedSingleton getInstance() {
        if(instance == null) {
            instance = new SynchronizedSingleton();
        }

        return instance;
    }
}
