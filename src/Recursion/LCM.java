package Recursion;

import java.util.Scanner;

public class LCM {
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

        int GCD = gcd(x,y);

        int LCM = (x*y)/GCD;

        System.out.println(LCM);
    }
}