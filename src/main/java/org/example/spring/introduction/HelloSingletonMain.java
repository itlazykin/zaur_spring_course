package org.example.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSingletonMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        System.out.println(myDog);
        System.out.println(yourDog);
        System.out.println(yourDog == myDog);
        context.close();
    }
}
