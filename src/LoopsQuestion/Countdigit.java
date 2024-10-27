package LoopsQuestion;
import java.util.Scanner;
public class Countdigit {
    public static void main(String[] args) {
        //count the number of digit n
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number :");
           int n = sc.nextInt();
           int digit =0;
           int _n =n;
           while(n>0){
               digit++;
               n =n/10;//updation
           }
        System.out.println("the number of digit is : "+_n+" ="+digit);
    }
}
