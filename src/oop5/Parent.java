package oop5;

public abstract class Parent {
    int age;

    final int VALUE;

    public Parent(int age){
        this.age = age;
        VALUE = 2345;
    }

    static void hello(){
        System.out.println("hey");
    }
    abstract void career();
    abstract void partner();


}
