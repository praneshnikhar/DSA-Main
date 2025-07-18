package oop5;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i am going to be a coder" );
    }



    @Override
    void partner() {
        System.out.println("I love kritika she is");
    }
}
