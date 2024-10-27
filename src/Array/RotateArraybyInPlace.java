package Array;

import java.util.Scanner;

public class RotateArraybyInPlace {
    public static void PrintArray(int[] arr){
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]  +" ");
        }
        System.out.println();
    }
    public static void swapInArray(int [] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void ReverseArrayInPlace(int[] arr,int i, int j){
         while (i < j) {
             swapInArray(arr,i,j);
             i++;
             j--;
        }
    }
    public static void rotateinPlace(int[] arr,int k){
        int n =arr.length;
        k=k%n;
        ReverseArrayInPlace(arr,0,n-k-1);
        ReverseArrayInPlace(arr,n-k,n-1);
        ReverseArrayInPlace(arr,0,n-1);
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
        System.out.println("enter k element : " );
        int k= sc.nextInt();

        System.out.println("Original Array");
        PrintArray(arr);
         rotateinPlace(arr,k);
        System.out.println("rotate Array ");
        PrintArray(arr);
    }
}
