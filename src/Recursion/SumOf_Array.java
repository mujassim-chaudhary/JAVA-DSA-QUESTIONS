package Recursion;

public class SumOf_Array {

    public static int ArraySum(int[] arr, int idx){
        int n = arr.length;
        //base case
        if (idx==n){
            return 0;
        }

        //recursive work and sub problem
        int smallAns = ArraySum(arr,idx+1);

        //self work
        int Ans = smallAns +arr[idx];
        return Ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,12,3};

        System.out.println(ArraySum(arr,0));

    }
}
