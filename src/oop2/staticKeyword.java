package oop2;

import com.sun.tools.javac.Main;

public class staticKeyword {
    public static void main(String[] args) {

    }
    //this is not depentdent on objects
    static  void fun(){
//        greeting();//you cant use this because it requires an instance
        // but the fucntion you are uisng it in does not depend on instances

        //you cannot access non static stuff without refrencing their instances in a
        //static context


//        Main obj = new Main();
//        obj.greeting();

    }

    void greeting(){
//        fun();
        System.out.println("hello world");
    }
}
