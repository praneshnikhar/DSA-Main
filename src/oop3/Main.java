//INHERITANCE

package oop3;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(5);
//        System.out.println(box.l + " " + box.w+ " "+ box.h);
//
//        BoxWeight box2 = new BoxWeight();
//        BoxWeight box3 = new BoxWeight(2,3,4,5);
//        System.out.println(box2.h+" "+box2.weight);

        Box box5 = new BoxWeight(2,3,4,5);
        System.out.println(box5);
        //there are many variables in both parent and child classes
        //you are given acces to variables that are in the ref type i.e boxweight
        ///hence, you should have access to weight variable
        //this also means , that the ones you are trying to access  should be initailiased
        //but here when the object itself is of type parent class how will you vcall the constructor of child class?
        //this is why error

//        BoxWeight box6 = new Box(2,3,4);
//        System.out.println(box6);

        BoxPrice box = new BoxPrice(5,8,100);
    }
}
