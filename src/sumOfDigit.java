public class sumOfDigit {
    public static void main(String[] args) {
    int ans = sum(1342);
    int ans1 = prod(55);
        System.out.println(ans);
        System.out.println(ans1);

    }
    static int sum(int n ){
        if( n ==0 ){
            return 0;
        }
        return (n%10) + sum(n/10);
    }

    static int prod(int n ){
        if( n%10 ==n ){
            return 0;
        }
        return (n%10) * sum(n/10);
    }

}
