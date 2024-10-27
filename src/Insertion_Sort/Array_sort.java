package Insertion_Sort;

public class Array_sort {

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;

            while(j>0 && arr[j] < arr[j-1]){
                // swap them
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,8,6,0,9,12};

        insertionSort(arr);

        for (int i : arr){
            System.out.print(i+" ");
        }

    }
}

