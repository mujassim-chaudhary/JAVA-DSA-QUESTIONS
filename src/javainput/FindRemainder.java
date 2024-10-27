package javainput;
import java.util.Scanner;
public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;//dividend
        System.out.print("Enter the dividend  : ");
        a =sc.nextInt();
        int b;// divisor
        System.out.print(" Enter the divisor  : ");
        b =sc.nextInt();
        int q =a/b;//q=quisont
        int r=a-(b*q);
        System.out.println("the remainder when "+a+"is divided "+b+" is "+r);
               //OR
        //reminder by modulo operater
//        int a=5;
//        int b =2;
//        int rem =a%b;
//        System.out.println(rem);
    }
}
