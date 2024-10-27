package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void PrintArray(int[] arr){
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]  +" ");
        }
        System.out.println();
    }
    public static int[] ReverseArray(int[] arr){
        int n = arr.length;
        int [] ans=new int[n];
        int j=0;
      //  traverse a array in Reverse direction;

        for (int i =n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter Original Array ");
        int[] arr =new int[5];
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=ReverseArray(arr);
        PrintArray(ans);
    }
}
