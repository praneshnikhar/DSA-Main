package oop5;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(18);
        son.career();

        Daughter daughter = new Daughter(9);
        daughter.career();

        Parent.hello();
    }
}
