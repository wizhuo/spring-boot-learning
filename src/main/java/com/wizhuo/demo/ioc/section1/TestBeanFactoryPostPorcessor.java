package com.wizhuo.demo.ioc.section1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author lizhuo
 * @since 2019/11/13 17:04
 */
public class TestBeanFactoryPostPorcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("TestBeanFactoryPostPorcessor->postProcessBeanFactory");
    }
}
