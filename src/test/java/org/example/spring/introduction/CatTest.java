package org.example.spring.introduction;

import org.junit.jupiter.api.Test;

class CatTest {

    @Test
    void whenSayThanOk() {
        Pet pet = new Cat();
        pet.say();
        "miaaaow".equals(this);
    }
}