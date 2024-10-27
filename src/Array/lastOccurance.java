package Array;

import java.util.Scanner;

public class lastOccurance {
    public static int Occurance(int[] arr, int x) {
        int lastOccurance = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastOccurance=i;
            }
        }
        return lastOccurance;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter "+n+" element");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("enter X value :");
        int x = sc.nextInt();


        System.out.println("last occurance of X  "+Occurance(arr,x));
    }
}


