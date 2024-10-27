package Function;
import java.util.Scanner;
public class Syntax_parameter {

    public static int cal_sum(int num1,int num2){
        int sum=num1+num2;

        return sum;
    }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           int b= sc.nextInt();
           int sum=cal_sum(a,b);
        System.out.println("sum is : "+sum);

    }
}
