package com.coherentsolutions.advanced.java.section22.advanced;

import java.util.HashSet;
import java.util.Objects;

/**
 * Demonstrates the use of HashSet with custom objects.
 * HashSet requires proper implementation of equals() and hashCode() for custom objects to maintain uniqueness.
 */
public class Ex04HashSetWithCustomObjects {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        // Adding custom objects to HashSet
        set.add(new Person("John", 30));
        set.add(new Person("Alice", 25));
        set.add(new Person("John", 30)); // Duplicate, will not be added

        // Displaying the elements of HashSet
        System.out.println("HashSet: " + set);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
