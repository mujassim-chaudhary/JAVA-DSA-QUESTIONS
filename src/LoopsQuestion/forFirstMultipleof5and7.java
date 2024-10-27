package LoopsQuestion;
import java.util.Scanner;
public class forFirstMultipleof5and7 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int num =1;

           for(;true;num++){
               if((num%5==0)&&(num%7==0)){
                   System.out.println("found ans :"+num);
                    break;
               }
           }
    }
}
