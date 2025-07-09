public class WrapperExample {
    public static void main(String[] args) {
        int a =10;
        Integer num = 45;
         int b = 20;
        swap(a, b);
        System.out.println(a +" " + b);
        A pranesh = new A("pranesh Nikhar");

        A obj;
        for (int i = 0; i < 1000; i++) {
            obj = new A("pranesh nikhar");
            System.out.println(obj);
        }
    }
     static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }


}
class A{
    final int num = 10;
    String name;

    public A(String name){
        System.out.println("object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("this object is destroyed");
    }
}


