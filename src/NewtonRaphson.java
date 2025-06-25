//this method is used for finding square root of a number by using
//newton raphson method

public class NewtonRaphson {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while (true) {
             root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }
            x =root;
        }
        return root;
    }
}
