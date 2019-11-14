package com.wizhuo.demo.ioc.section1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author lizhuo
 * @since 2019/11/13 17:03
 */
public class TestBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "-->" + "TestBeanPostProcessor->postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "-->" + "TestBeanPostProcessor->postProcessAfterInitialization");
        return bean;
    }
}
