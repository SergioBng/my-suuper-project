package com.trutsyn.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sergey Trutsyn 04.08.2022
 */
public class TestBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = context.getBean("car", Car.class);
        System.out.println(car.getModel());
        System.out.println(car.getColor());

        Sharing sharing = context.getBean("sharing", Sharing.class);
        sharing.bookVehicle();

        context.close();
    }
}
