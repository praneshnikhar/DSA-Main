package oop4;

public class ObjectDemo {
    int num;
    float gpa;
    //already covered
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //we will go in details of how to create in hashmap lecture
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num; //casting
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ObjectDemo() {
        super();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(56,5);
        ObjectDemo obj2 = new ObjectDemo(56,7);
//        System.out.println(obj.hashCode());

        if(obj1 == obj2){
            System.out.println("obj1 is equal to obj2");
        }

        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }
        System.out.println(obj1.getClass());
    }
}


