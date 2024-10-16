// Java Program to Convert Decimal Number to Binary Using Arrays

import java.io.*;

class javaexercises{
    static void decToBinary(int n){
        int[] binaryNum = new int[1000];

        int i = 0;
        while(n>0){
            binaryNum[i] =n%2;
            n = n/2;
            i++;
        }
        for (int j = i - 1;i >=0; j--){
            System.out.println(binaryNum[j]);
        } 
        
    }
    public static void main(String[] args) {
        int n = 17;
        System.out.println("Decimal - " + n);
        System.out.println("BInary - ");
        decToBinary(17);
    }
}

