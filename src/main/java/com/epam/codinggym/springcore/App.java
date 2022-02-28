package com.epam.codinggym.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ControlCenter controlCenter = ctx.getBean("controlCenter", ControlCenter.class);
        controlCenter.takeFlights();
        ctx.close();
    }
}
