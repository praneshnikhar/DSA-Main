package oop;

public class main {
    public void main(String[] args) {


        Student[] students = new Student[5];

        Student pranesh = new Student();
//        pranesh.rno = 12;
        System.out.println(pranesh.rno);

    }

    class Student{
        int[] rno = new int[5];
        String[] name= new String[5];
        float[] marks = new float[5];
    }
}
