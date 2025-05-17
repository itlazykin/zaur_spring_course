package org.example.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAppContextMain1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = new Person(pet);
        person.callYourPet();
    }
}
