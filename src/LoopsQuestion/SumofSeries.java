package LoopsQuestion;
import java.util.Scanner;
//find the sum of the following series
// S =1-2+3-4......n
public class SumofSeries {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int sum =0;

           for(int i=1;i<=n;i++){
               if(i%2==0){
                   sum-=i;
               }
               else{
                   sum+=i;
               }
           }
        System.out.println("sum of series is :"+sum);
    }
}
