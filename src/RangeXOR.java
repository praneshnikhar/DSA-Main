public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = xor(b) ^ xor(a-1);

        System.out.println(ans);

        int ans2= 0;
        for(int i = a; i <= b; i++){
            ans2 ^=i;
        }
        System.out.println(ans2);
    }
}
