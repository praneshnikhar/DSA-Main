public class OnetoN {
    public static void main(String[] args) {
        fun(6);
    }
    
    static void fun(int n ){
        if(n == 0){
            return;
        }

        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }
    }
}
