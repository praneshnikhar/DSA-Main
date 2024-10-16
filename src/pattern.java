//how to approach
//*
//**
//***
//****
//*****
//<<<<<<<<<<<<STEPS->>>>>>>>>>>>>
//.no. of lines = no of rows = no of times for outer loop
//
//2. identify for every row no. how many columns are there or
//public class pattern, types of elements in the column
//3.what do u need
//try to find formula relating row and column


public class pattern {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row, run the column
            for (int col = 1; col <= row; col++) { // Change < to <=
                System.out.print("* "); // Use print to stay on the same line
            }
            // When one row is printed, add a new line
            System.out.println(); // This will print a new line after each row
        }
    }
}
