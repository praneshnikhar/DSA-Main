public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(6);
    }
    static void print(int n ){
        if( n ==5 ){
            System.out.println(5);
            return ;
        }
        System.out.println(n);

        //recursion call
        //if you are calling a function again and again , you can treat it as a separate call in the stack
        //this is called tail recursion
        // this is the last function call.
        print(n+1);
    }
}
