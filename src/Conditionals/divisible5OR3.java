package Conditionals;
import java.util.Scanner;
public class divisible5OR3 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter a nuber : ");
           int n = sc.nextInt();
           if(n%5==0|| n%3==0){
               System.out.println(n+" this is a divisible by either  5 OR 3");
           }else{
               System.out.println("this is not divisible by either 5 OR 3");
           }
    }
}
