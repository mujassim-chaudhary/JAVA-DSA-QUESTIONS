package Selection_Sort;

public class Array_sort {

    public static void Selection_sort(int[] arr){
        int n  = arr.length;

        for (int i =0;i<n-1;i++){ // i represent the current index
            //find the minimum element in unsort part of array
            int min_index = i;

            for (int j = i+1; j<n;j++ ){
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            if (min_index != i){
                // then swap
                // swap arr[min_index], arr[i]

                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }
    public static void main(String[] args) {
         int[] arr  = {7,8,3,5,2,1,0,4,90,100,88};
         Selection_sort(arr);

         for (int i =0;i< arr.length;i++){
             System.out.print(arr[i]+ " ");
         }
    }
}
