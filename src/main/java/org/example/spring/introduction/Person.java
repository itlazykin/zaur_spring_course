package org.example.spring.introduction;

public class Person {
    private final Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pat!");
        pet.say();
    }
}
