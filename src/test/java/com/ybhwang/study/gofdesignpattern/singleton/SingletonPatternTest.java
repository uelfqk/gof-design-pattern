package com.ybhwang.study.gofdesignpattern.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SingletonPatternTest {

    @Test
    @DisplayName("객체 생성 체크를 통한 사용한 싱글톤 활용")
    void getInstanceTest() throws Exception {
        // given when
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        // then
        Assertions.assertThat(settings1).isEqualTo(settings2);
    }
    
    @Test
    @DisplayName("동기화(synchronized)를 사용한 싱글톤 활용")
    void getInstanceSynchronizedTest() throws Exception {
        // given when
        SynchronizedSingleton singleton1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton singleton2 = SynchronizedSingleton.getInstance();

        // then
        Assertions.assertThat(singleton1).isEqualTo(singleton2);
    }

    @Test
    @DisplayName("즉시 생성을 사용한 싱글톤 활용")
    void getInstanceEagerTest() throws Exception {
        // given when
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        // then
        Assertions.assertThat(singleton1).isEqualTo(singleton2);
    }

    @Test
    @DisplayName("더블 체크 락킹을 사용한 싱글톤 활용")
    void getInstanceDoubleCheckLockingTest() throws Exception {
        // given when
        DoubleCheckedLockingSingleton singleton1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton singleton2 = DoubleCheckedLockingSingleton.getInstance();

        // then
        Assertions.assertThat(singleton1).isEqualTo(singleton2);
    }

    @Test
    @DisplayName("lazyLoading 을 사용한 싱글톤 활용")
    void getInstanceLazyLoadingTest() throws Exception {
        // given when
        LazyLoadingSingleton singleton1 = LazyLoadingSingleton.getInstance();
        LazyLoadingSingleton singleton2 = LazyLoadingSingleton.getInstance();

        // then
        Assertions.assertThat(singleton1).isEqualTo(singleton2);
    }
}