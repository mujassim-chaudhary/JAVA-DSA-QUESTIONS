package Count_Sort;

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

    static void basicCountSort(int[] arr){  // 2 4 2 2
        //this is not stable algorithm  due to this it is not good approach

       int max = findmax(arr); // find the largest element of the array
        int[] count = new int[max+1]; //this is a frequency arr
        for (int i = 0; i < arr.length ; i++) {
            /*
               0 0 3 0 1
               0 1 2 3 4
             */
            count[arr[i]]++;
        }

        //count arr ko traversse karthe hai
        int k =0;
        for (int i = 0; i < count.length ; i++) { //0 2 0 3 1 2
            for (int j = 0; j <count[i] ; j++) {
                arr[k++] = i;

            }
        }
    }

    public static void display(int[] a){
        for(int var : a){
            System.out.print(var+ " ");
        }
        System.out.println();
    }

    static void countsort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];

        int max = findmax(arr); // find the largest element of the array
        int[] count = new int[max+1]; //this is a frequency arr
        for (int i = 0; i < arr.length ; i++) {
            /*
               0 0 3 0 1
               0 1 2 3 4
             */
            count[arr[i]]++;
        }

        //make prefix sum array of count array
        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i-1];
        }

        //find the index of each element in the origonal array and put it output array
        for (int i = n-1; i>=0;i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        //copy all element of output arr to original array bcz it does not return a array
        for (int i = 0; i <n ; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        int[] arr ={1,4,5,2,2,5,8,6,4,7,8,7,5,1};
//        basicCountSort(arr); this is not stable algorith
        countsort(arr); // this is a stable algorithm
        display(arr);
    }
}
