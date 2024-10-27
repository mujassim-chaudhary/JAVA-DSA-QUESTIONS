package Conditionals;
import java.util.Scanner;
public class Divisibleby5and3 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        // divisible by 3 and by 5
      /*  if(n%3==0&&n%5==0){
            System.out.println(n+" This is diviosible by both ");
        }else{
            System.out.println(n+" this is not divisible by both");
        }*/
        //divisible by 5 but not divisible by 3
        if(n%5==0&&n%3!=0){
            System.out.println("this is divisible by 5 but not by  3");
        }else{
            System.out.println("This is default number ");
        }
    }
}
