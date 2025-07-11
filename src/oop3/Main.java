package oop3;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(5);
//        System.out.println(box.l + " " + box.w+ " "+ box.h);

        BoxWeight box2 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(2,3,4,5);
        System.out.println(box2.h+" "+box2.weight);
    }
}
