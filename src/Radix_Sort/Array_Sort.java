package Radix_Sort;

public class Array_Sort {

    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i =0; i < arr.length;i++){
            if (arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void countsort(int[] arr , int palce){
        int n = arr.length;
        int[] output = new int[n];

        int max = findmax(arr); // find the largest element of the array
        int[] count = new int[10]   ; //this is a frequency arr
        for (int i = 0; i < arr.length ; i++) {
            /*
               0 0 3 0 1
               0 1 2 3 4
             */
            count[(arr[i]/palce)%10]++;
        }

        //make prefix sum array of count array
        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i-1];
        }

        //find the index of each element in the origonal array and put it output array
        for (int i = n-1; i>=0;i--){
            int idx = count[(arr[i]/palce)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/palce)%10]--;
        }

        //copy all element of output arr to original array bcz it does not return a array
        for (int i = 0; i <n ; i++) {
            arr[i] = output[i];
        }

    }

    public static void radixSort(int[] arr){
        int max = findmax(arr); //get maximun element

        //apply counting sort to sort element based on place value
        for (int place = 1; max/place >0; place *=10){
            countsort(arr,place);
        }

    }

    public static void main(String[] args) {
        int[] arr = {43,453,626,894,0,3};
        radixSort(arr);

        for (int var : arr){
            System.out.print(var+ " ");
        }
        System.out.println();
    }
}









