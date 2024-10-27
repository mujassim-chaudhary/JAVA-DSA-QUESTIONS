package LoopsQuestion;
import java.util.Scanner;
public class Sumofdigit {
    public static void main(String[] args) {
        //find the sum of digits in a given number n
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int sumofdigit =0;
           int _n =n;
           for(;n>0;n=n/10){
               sumofdigit += n%10;
              // n=n/10 updation
           }
        System.out.println("sum of digit is : "+_n+" ="+sumofdigit);
    }
}
