package javainput;
import java.util.Scanner;
public class SumOf2numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Enter the value of x : ");
        x = sc.nextInt();
        System.out.print("Enter the value of y  : ");
        y = sc.nextInt();
        int sum =x+y;
        System.out.println("sum of 2 numbers is : " +sum);

    }
}
