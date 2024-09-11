import java.util.Scanner;
public class sum {

    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num1 = sc.nextInt();

        System.out.println("enter 2nd number: ");
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.println(sum);



    }
}
