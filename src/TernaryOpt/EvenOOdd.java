package TernaryOpt;
import java.util.Scanner;
public class EvenOOdd {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int num =sc.nextInt();

         String ans;
        ans  =     (num%2==0)?" the number is even" +num : " the number is odd" +num ;
        System.out.println(ans);

    }
}
