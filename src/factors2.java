public class factors2 {
    public static void main(String[] args) {
        factors2(20);
    }

    static void factors2(int n ){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n%i ==0){
                if(n/i == i){
                    System.out.println(i);
                }else{
                    System.out.println(i + " " + n/i);
                }

            }
        }
    }
}
