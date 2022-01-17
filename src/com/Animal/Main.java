package com.Animal;

import java.util.PrimitiveIterator;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 3, "meow meow");
        Horse horse = new Horse("Bony", 150,5 );
        Koala koala = new Koala("Lily", 5,"Australia" );

        koala.makeSound();
        System.out.println(koala.geography);
        horse.eat();
    }
}
