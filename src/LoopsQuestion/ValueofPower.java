package LoopsQuestion;
import java.util.Scanner;
//a power of b
public class ValueofPower {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter the value is:");
           int a = sc.nextInt(),b= sc.nextInt();
           int ans =1;
           for(int i=1;i<=b;i++){
               ans =ans*a;//

           }
        System.out.println("the ans is a power of b : "+ans);
    }
}
