package Recursion;

import java.util.Scanner;

public class SeriesSum {

    public static int SeriesSum1(int n){
        // base case
        if (n == 0) return 0;

//        //recursive work
//         int sum = SeriesSum1(n-1);
//
//         // self work
//        return sum + n;

        //recursive relation
        return SeriesSum1(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(SeriesSum1(n));
    }
}
