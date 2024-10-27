package Recursion;

import java.util.Scanner;

public class RecursiveGCD {

    static int gcd(int x,int y){

        // base case
        if (y == 0){
            return x;
        }

        //recursive approach
        return gcd(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(gcd(x,y));
    }
}
