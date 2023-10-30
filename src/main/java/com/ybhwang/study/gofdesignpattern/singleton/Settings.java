package com.ybhwang.study.gofdesignpattern.singleton;

public class Settings {

    private static Settings instance;

    private Settings() {

    }

    // TODO 가장 간단한 싱글톤 패턴 구현
    //      instance 변수가 null 이면 객체를 새로 생성해서 반환하고
    //      아니면 instance를 그대로 반환한다.
    //      getInstance 메소드를 계속 호출하게 됬을때 항상 동일한 객체를 얻을 수 있다.
    //      단, 아래 코드는 thread safe 하지 않다는 단점이 있다.
    public static Settings getInstance() {
        if(instance == null) {
            instance = new Settings();
        }

        return instance;
    }
}
