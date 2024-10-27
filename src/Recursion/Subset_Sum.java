package Recursion;

public class Subset_Sum {

    public static void subsetsum(int[] a,int n,int idx,int currsum){
       //base case
        if (idx >= n){
            System.out.println(currsum);
            return;
        }

//recursive work

        // curr idx + currsum
        subsetsum(a,n,idx+1,currsum+ a[idx]);//included

        // currsum
        subsetsum(a,n,idx+1,currsum);//excluded
    }

    public static void main(String[] args) {
        int[] a ={2,4,5};
        int n = a.length;

        subsetsum(a,n,0,0);

    }
}
