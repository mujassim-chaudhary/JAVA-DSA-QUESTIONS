package LoopsQuestion;
import java.util.Scanner;
//Reverse the digit of a number
public class ReverseNumber {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  :");
           int n = sc.nextInt();
           int _n=n;//original value of n
           int rev =0;
           while(n>0){
               rev =rev*10 +n%10;
               n=n/10;
           }
        System.out.println("the reverse number is "+_n+" ="+rev);
    }
}
