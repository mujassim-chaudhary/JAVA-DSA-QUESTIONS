package Recursion;

public class Print_Array {

    public static void PrintArray(int[] arr ,int idx){
        int n = arr.length;
        //base case
        if (idx == n){
            return;
        }

        //self work
        System.out.print(arr[idx]+ " ");

        //recursive work  or=> sub problem
        PrintArray(arr,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,1,8,9};
        PrintArray(arr,0);
    }
}
