package org.example.spring.introduction;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("miaaaow");
    }
}
