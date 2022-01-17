package com.Animal;

public abstract class Animal {
    String name;
    int weight;

    public Animal (String name, int weight) {
        System.out.println();
        this.name = name;
        this.weight = weight;
    }
    public abstract void makeSound();{
        //System.out.println("животное {} издает звук");
    }
    public abstract void eat(); {
        //System.out.println("животное {} кушает");
    }
    public abstract void sleep(); {
        //System.out.println("животное {} спит");
    }

    }
    class Koala extends Animal {
        String geography = "New Zeland";

        public Koala(String name, int weight) {
            super(name, weight);
        }

        public Koala(String name, int weight, String geography) {
            super(name, weight);
            this.geography = geography;
        }
        @Override
        public void makeSound() {
            System.out.println("Коала " + name + " издает звук");
        }
        @Override
        public void eat() {
            System.out.println("Коала " + name + " кушает эвкалипт");
        }
        @Override
        public void sleep() {
            System.out.println("Коала " + name + " спит на ветке");
        }


}

    class Cat extends Animal {
        String catSound;

        public Cat(String name, int weight) {
            super(name, weight);
        }

        public Cat(String name, int weight, String catSound) {
            super(name, weight);
            this.catSound = catSound;
        }

        @Override
        public void makeSound() {
            System.out.println("Кот " + name + " издает звук");
        }
        @Override
        public void eat() {
            System.out.println("Кот " + name + " кушает корм");
        }
        @Override
        public void sleep() {
            System.out.println("Кот " + name + " спит на кресле");
        }
    }
     class Horse extends Animal {
        int years;

        public Horse(String name, int weight) {
            super(name, weight);
        }

        public Horse(String name, int weight, int years) {
            super(name, weight);
            this.years = years;
        }

        @Override
        public void makeSound() {
            System.out.println("Лошадь " + name + " издает звук");
        }
        @Override
        public void eat() {
            System.out.println("Лошадь " + name + " кушает сено");
        }
        @Override
        public void sleep() {
            System.out.println("Лошадь " + name + " спит в конюшне");
        }
    }

