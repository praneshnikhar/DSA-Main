//public class pattern6 {
//    public static void main(String[] args) {
//    pattern5(5);
//    }
//
//    static void pattern5(int n){
//        for (int row = 0; row <2 * n; row++) {
//            int totalColsInRow =row > n ? 2 * n - row : row;
//            for(int col = 0; col < totalColsInRow; col++ ){
//                System.out.println("* ");
//
//            }
//            System.out.println();
//
//        }
//    }
//}

public class pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row >= n ? 2 * n - row : row ;
            int noOfSpaces= n- totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.println(" ");

            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* "); // Use print instead of println to keep stars in the same line
            }
            System.out.println(); // Move println outside the inner loop to start a new line after each row
        }
    }
}

