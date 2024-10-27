package Array;

import java.util.Scanner;

public class InputinArray {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter "+n+" element");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println( "print output ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
