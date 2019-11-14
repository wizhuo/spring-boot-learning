package com.wizhuo.demo.ioc.section1;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author lizhuo
 * @since 2019/11/13 17:05
 */
public class Test {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:ioc/bean.xml");
        TestBean testBean = (TestBean)context.getBean("testBean");
        context.destroy();

    }
}
