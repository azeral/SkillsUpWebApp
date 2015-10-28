package net.bondar.webapp.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Azeral on 28.10.2015.
 */
public class AppHibernate {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        context.stop();
    }
}
