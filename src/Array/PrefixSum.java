package Array;

import java.util.Scanner;

public class PrefixSum {

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



      public static int[] makeprefixSumArray(int[] arr){
        int n= arr.length;
        for (int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
      }

        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter array size :");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("enter " + n + " element");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Original Array ");
            PrintArray(arr);

            int [] pref=makeprefixSumArray(arr);
            System.out.println("Prefix sum ");
            PrintArray(pref);


        }
}