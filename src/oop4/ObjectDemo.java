package oop4;

public class ObjectDemo {
    int num;

    //already covered
    public ObjectDemo(int num) {
        this.num = num;
    }

    //we will go in details of how to create in hashmap lecture
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
        ObjectDemo obj = new ObjectDemo(34);
        System.out.println(obj.hashCode());
    }
}


