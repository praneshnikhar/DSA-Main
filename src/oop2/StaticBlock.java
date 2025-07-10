package oop2;

//this is a demo to show initialisation of the static variable;
public class StaticBlock {
    static int a =4;
    static int b ;

    //this will only run once , when the first object is created when the obj is loaded first time
    static{
        System.out.println("i am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
        StaticBlock.b +=3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
    }

}
