//1
//12
//123
//1234

public class pattern4 {
    public static void main(String[] args) {
        pattern4(4);
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row, run the column
            for (int col = 1; col <= row; col++) { // Change < to <=
                System.out.print(col); // Use print to stay on the same line
            }
            // When one row is printed, add a new line
            System.out.println(); // This will print a new line after each row
        }
    }
}
