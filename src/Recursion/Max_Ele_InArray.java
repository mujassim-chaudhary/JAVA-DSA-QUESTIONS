package Recursion;

public class Max_Ele_InArray {

    public static int maxInArray(int[] arr,int idx){
        int n = arr.length;
        //base case
        if (idx == n-1){
            return arr[idx];
        }

        //sub problem and recursive work
        int smallAns = maxInArray(arr,idx+1);

        //self work
        int Ans = Math.max(arr[idx] ,smallAns);
        return Ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,17,41,8,9};

        System.out.println(maxInArray(arr,0));
    }
}
