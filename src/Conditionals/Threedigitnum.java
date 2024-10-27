package Conditionals;
import java.util.Scanner;

public class Threedigitnum {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n>99&&n<1000){
            System.out.println(n+", this number is three digit number ");
        }else{
            System.out.println(n+" this is not a three digit number ");
        }
    }
}
