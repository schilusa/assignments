package com.SpringA1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {
  public static void main(String[] args) {

    AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

    BeanLifeCycle obj = (BeanLifeCycle) context.getBean("beanlifecycle");
    obj.getMessage();
    context.registerShutdownHook();
  }
}
