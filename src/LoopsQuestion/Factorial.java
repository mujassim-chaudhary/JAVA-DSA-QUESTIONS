package LoopsQuestion;
import java.util.Scanner;
//fatorial
public class Factorial {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter the number please :");
           int n = sc.nextInt();
           int fact=1;

           for(int i=1 ;i<=n;i++){
                fact*=i;
           }
        System.out.println("the factorial is :"+fact);
    }
}