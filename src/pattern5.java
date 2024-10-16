//*
//**
//***
//****
//*****
//****
//***
//**
//*
//
//if row no> N;
//col = N - (row-N+1)
//else=2N - row - 1
//col= row

public class pattern5 {
    public static void main(String[] args) {
        pattern5(4);
    }

    static void pattern5(int n) {
        // Upper part of the pattern
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
