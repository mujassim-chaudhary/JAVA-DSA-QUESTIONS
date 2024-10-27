package Recursion;

import java.util.Scanner;

public class SeriesSumWithAlternate_Sign {

    public static int AlternateSum(int n ){
        // base case
        if (n == 0 ) return 0;

        //recursive relation
        if (n %2 ==  0){ // even
            return AlternateSum(n-1) -n;
        } else{ // odd
            return AlternateSum(n-1) +n;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number :");
        int n = sc.nextInt();

        int sum = AlternateSum(n);
        System.out.println(sum);


    }
}
