public class pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }
    static void pattern3(int n ){
        for(int row = n; row > 0; row-- ){
            for(int col = 1 ; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
