package LoopsQuestion;
import java.util.Scanner;
public class WhilebySumofnNum {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer value : ");
           int n= sc.nextInt();
           int i=1;
           int sum =0;

           while(i<=n){
               System.out.println(i);
               sum =sum+i;
               i++;

           }

        System.out.print("sum of n integer :");
        System.out.println(sum);
    }
}
