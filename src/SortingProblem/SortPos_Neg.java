package SortingProblem;

public class SortPos_Neg {

    public static void disply(int[] arr){
        for (int val :arr ){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    // this is like a quick sort partition method
    public static void partition(int[] arr){
        int l =0;
        int r = arr.length-1;

        while (l < r){
            while (arr[l] <0) l++;
            while(arr[r] >= 0) r--;

            if (l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-13,7,20,0,-4,11,-11,5,-13};

        partition(arr);
        disply(arr);
    }

}
