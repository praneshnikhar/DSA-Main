package oop;

public class Human {
    int age;
    String name;
    boolean married;
    int salary;
    static long population;

    public Human(int age, String name, boolean married, int salary) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.salary = salary;
        population += 1;
    }
}
