package oop3.polymorphism;

import com.sun.security.auth.NTNumericCredential;

public class Numbers {
    int sum(int a , int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(2,3);
        num.sum(1,2,3);
        num.sum(4,5,6) ;
    }
}
