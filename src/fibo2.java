public class fibo2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboFormula(50));
//        }
        System.out.println(fiboFormula(50));
//        int ans = fibo(50);
//        System.out.println(ans);

    }
    static int fiboFormula(int n ){
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)/Math.sqrt(5)));
    }
    static int fibo(int n ){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) +fibo(n-2);

    }
}
