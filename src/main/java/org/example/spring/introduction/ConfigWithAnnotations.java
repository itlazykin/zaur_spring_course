package org.example.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");
        Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();
        context.close();
    }
}
