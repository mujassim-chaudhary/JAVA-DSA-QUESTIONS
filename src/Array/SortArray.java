package Array;

import java.util.Scanner;

public class SortArray {
    public static void PrintArray(int[] arr){
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]  +" ");
        }
        System.out.println();
    }

    public static void sortZeroesAndOnes(int [] arr){
        int n= arr.length;
        int Zeroes =0;
      //count number of zeroes
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                Zeroes++;
            }
        }
        //0 to Zeroes-1 mai 0,Otherwise Zeroes to n-1 mai 1:
        for (int i=0;i< arr.length;i++){
            if (i<Zeroes){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :" );
        int n= sc.nextInt();
        int [] arr=new int[n];

        System.out.println("enter "+n+" element");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Original Array ");
        PrintArray(arr);

        sortZeroesAndOnes(arr);
        System.out.println("sorted array ");
        PrintArray(arr);

    }
}

