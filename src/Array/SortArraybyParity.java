package Array;

import java.util.Scanner;

public class SortArraybyParity {
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
    public static void sortbyParity(int [] arr){
        int n= arr.length;
        int left =0, right =n-1;

        while (left<right){
            if (arr[left]%2==1 && arr[right]%2==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }

            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1){
                right--;
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

        sortbyParity(arr);
        System.out.println("sorted array ");
        PrintArray(arr);

    }
}
