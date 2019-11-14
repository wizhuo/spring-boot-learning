package com.wizhuo.demo.ioc.section1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author lizhuo
 * @since 2019/11/13 17:04
 */
public class TestBean implements InitializingBean, DisposableBean {
    private String name;
    private int age;

    public TestBean() {
        System.out.println("TestBean->constrcutor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("TestBean->setter");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("TestBean->setter");
        this.age = age;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TestBean->destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestBean->afterPropertiesSet");
    }
}
