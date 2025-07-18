package oop5;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i am going to be a engineer" );
    }



    @Override
    void partner() {
        System.out.println("I love kritika she is");
    }
}
