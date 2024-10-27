package Conditionals;
import java.util.Scanner;
public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente a integer : ");
        int n = sc.nextInt();
        if(n<0){
            n=n*(-1);
            System.out.println("The absolute value is : "+n);
        }else{
            System.out.println(" the absolute value is : "+n);
        }
    }
}
