package org.example.spring;

import org.example.spring.configuration.Config;
import org.example.spring.introduction.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
