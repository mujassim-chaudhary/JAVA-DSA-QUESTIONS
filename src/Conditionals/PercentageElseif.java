package Conditionals;
import java.util.Scanner;
public class PercentageElseif {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter a percentage of student :");
        int n = sc.nextInt();
        if(n>90){//OR (n>90&&n<100)
            System.out.println("Excellent ");
        }
        else if(n>80){
            System.out.println("very good");
        }
        else if(n>70){
            System.out.println("Good");
        }
        else if(n>60){
            System.out.println("can do better ");
        }
        else if(n>50){
            System.out.println("Average ");
        }
        else{
            System.out.println("Fail");
        }
    }
}
