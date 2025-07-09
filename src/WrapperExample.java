public class WrapperExample {
    public static void main(String[] args) {
        int a =10;
        Integer num = 45;
         int b = 20;
        swap(a, b);
        System.out.println(a +" " + b);
        A pranesh = new A("pranesh Nikhar");

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
        this.name = name;
    }
}
