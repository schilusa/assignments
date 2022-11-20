package com.company;

import org.springframework.beans.factory.BeanFactory;

/**
 * TODO schilusa This type ...
 *
 */
public class DrawingApplication {

  public static void main(String[] args) {

    BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

  }

}
