package Recursion;

import java.util.Scanner;

public class Print_nTo_1 {

    public static void printDec(int n){
        //Base case
        if (n == 1){
            System.out.print(n);
            return;
        }

        //self work
        System.out.print(n+ " ");

        //recursive work
        printDec(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int n = sc.nextInt();
        printDec(n);
    }

}
