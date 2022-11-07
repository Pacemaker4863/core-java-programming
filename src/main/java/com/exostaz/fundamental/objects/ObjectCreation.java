package com.exostaz.fundamental.objects;

public class ObjectCreation {
    public static void main(String[] args) {
        Cat cat = new Cat("Golo", 11);
    }
}

class Cat {
    String status = "Initializing";
    {
        System.out.println("Executing Instance Initializer Block before the fields name and age but after status init (in the file)");
//        System.out.println("The cat's name is " + name); // null
//        System.out.println("The cat's age " + age);
        System.out.println("The object status is " + this.status);
    }

    private String name; // null by default
    private int age = 11;

    {
        System.out.println("Executing Instance Initializer Block before constructor (in the file)");
        System.out.println("The cat's name is " + name); // null
        System.out.println("The cat's age " + age);
    }

    public Cat(String name, int age) {
        this.name = name; // this.name is necessary to init the field
        this.age = age;
        System.out.println("In constructor the cat's name is " + this.name + " with the age of " + this.age);
    }

    {
        System.out.println("Executing Instance Initializer Block after constructor (in the file)");
        System.out.println("The cat's name is still " + name); // null
        System.out.println("The cat's age " + age);
    }
}