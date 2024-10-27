package Array;

import java.util.Scanner;

public class ReverseArrayinPlace {
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

    public static void ReverseArrayInPlace(int[] arr){
        int i =0,j=arr.length-1;
        while (i < j) {

            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
       int [] arr={1,2,3,4,5,6};
       ReverseArrayInPlace(arr);
       PrintArray(arr);
    }
}
