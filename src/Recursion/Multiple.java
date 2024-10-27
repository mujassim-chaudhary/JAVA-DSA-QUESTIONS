package Recursion;

import java.util.Scanner;

public class Multiple {

    public static void Print_Multiple(int n , int k){
        // base case
//        if (k == 1){
//            System.out.println(n);
//            return;
//        }

        // another base case
        if (k ==0){
            return;
        }

        //recursive work or , sub problem
        Print_Multiple(n ,k-1);

        // self work
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        Print_Multiple(n ,k);
    }
}
