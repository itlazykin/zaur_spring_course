package org.example.spring.introduction;

import org.junit.jupiter.api.Test;

class DogTest {

    @Test
    void whenSayThanOk() {
        Pet pet = new Dog();
        pet.say();
        "Bow-Wow".equals(this);
    }
}