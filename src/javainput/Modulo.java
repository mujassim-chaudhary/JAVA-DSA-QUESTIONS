package javainput;
import java.util.Scanner;
public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;//dividend
        System.out.print("Enter the dividend  : ");
        a =sc.nextInt();
        int b;// divisor
        System.out.print(" Enter the divisor  : ");
        b =sc.nextInt();
        int r= a%b;
        System.out.println("the remainder when "+a+"is divided "+b+" is "+r);
    }
}
