package oop2;

//outside classes cannot be static , only inner classes can be static

class Test{ // inner class
    static String name;

    public Test(String name){
        this.name = name;
    }
}

public class InnerClasses {


    public static void main(String[] args) {
        Test a = new Test("pranesh");
        Test b = new Test("kunal");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//static class A{
    //NOT POSSIBLE
//}
