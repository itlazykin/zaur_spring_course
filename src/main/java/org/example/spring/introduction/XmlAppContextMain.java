package org.example.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAppContextMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
