//****
//****
//****
//****
public class pattern2 {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row, run the column
            for (int col = 1; col <= n; col++) { // Change < to <=
                System.out.print("* "); // Use print to stay on the same line
            }
            // When one row is printed, add a new line
            System.out.println(); // This will print a new line after each row
        }
    }
}
