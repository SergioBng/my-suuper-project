package com.trutsyn.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sergey Trutsyn 04.08.2022
 */
public class TestBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Vehicle vehicle = context.getBean("vehicleBean", Vehicle.class);
        Sharing sharing = context.getBean("sharing", Sharing.class);
        sharing.bookVehicle();

        context.close();
    }
}
