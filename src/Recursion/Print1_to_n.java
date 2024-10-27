package Recursion;
import java.util.Scanner;

public class Print1_to_n {

    public static void Printnum(int n){

        if (n == 1){  // base case  or halting case
            System.out.println(n);
            return;
        }

        Printnum(n-1);  //1 2 3. ... n-1  (Assumption case) -> recursive function
        System.out.println(n); // n (self work)
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = Sc.nextInt();
        Printnum(n);
    }
}
