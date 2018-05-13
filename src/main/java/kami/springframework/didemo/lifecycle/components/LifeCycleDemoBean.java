package kami.springframework.didemo.lifecycle.components;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in constructor");
    }

    @Override
    public void destroy() {
        System.out.println("## I'm terminated.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## My Beanfactory has been set " + beanFactory.getClass().getSimpleName());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My bean name is: " + s);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## I have my properties set!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set!");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## PostConstruct has been called!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## PreDestroy has been called!");
    }

    public void beforeInit(){
        System.out.println("## - Before init, called by Bean post processor!");
    }

    public void afterInit(){
        System.out.println("## - After init, called by Bean post processor!");
    }
}
