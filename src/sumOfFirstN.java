public class sumOfFirstN {
    public static void main(String[] args) {

    }
    //method1
    static int fun1(int n){
        return n*(n+1)/2;
    }

    //method 2
    int fun2(int n ){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum = sum +i;
        }
        return sum;
    }

    //method3
    int fun3(int n ){
        int sum=0;
        for (int i = 1 ; i <=n ;i++ ){
            for (int j = 1; j<= i; j++){
                sum++;
            }

        }
        return sum;
    }

}
