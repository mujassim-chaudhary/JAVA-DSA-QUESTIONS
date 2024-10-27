package Conditionals;

import java.util.Scanner;

public class Nested3OR5 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int n = sc.nextInt();
      /*  if(n%3==0||n%5==0){
            if(n%15!=0){
                System.out.println(n+" The number is divisible by 5 or 3 but not divisible by 15");

            }else {
                System.out.println(" the number is divisible by 15");
            }
        }else{
            System.out.println("default value" );
        }*/

        if((n%3==0||n%5==0)&&n%15!=0){
            System.out.println(n+" The number is divisible by 5 or 3 but not divisible by 15");
        }else{
            System.out.println("default value" );
        }

    }


}
