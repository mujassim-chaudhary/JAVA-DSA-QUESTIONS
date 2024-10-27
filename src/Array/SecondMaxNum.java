package Array;
import java.util.Scanner;

public class SecondMaxNum {

    public static int findMax(int [] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx){
                mx =arr[i];
            }
        }
        return mx;
    }

    public static int findSecondMax(int [] arr){
        int max=findMax(arr);

        for (int i=0;i<arr.length;i++){
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;

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
        System.out.println("second maximum number is :"+findSecondMax(arr));
    }
}
