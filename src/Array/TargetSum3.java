package Array;

import java.util.Scanner;

public class TargetSum3 {

    public static int pairSum(int[] arr,int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        System.out.println("pair number is :");
        return ans;
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

        System.out.println("enter target value :");
        int target = sc.nextInt();

        System.out.println( pairSum(arr,target));
    }
}

