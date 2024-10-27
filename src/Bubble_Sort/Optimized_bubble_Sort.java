package Bubble_Sort;

public class Optimized_bubble_Sort {

    public static void bubbleSort(int[] a){
        int n = a.length;

        //n-1 iteration or passes
        for(int i = 0;i<n-1;i++){
            boolean flag = false; // has any swap happened
            for (int j = 0; j <n-i-1 ; j++) {
                //last i element are already at correct position, so no need to check them;
                if (a[j] > a[j+1]){
                    //swap -a[j] , a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }

            }
            if (flag == false){
                return; //no swap happened
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,6,1,0,3,8,7,0,2,4,3};
        bubbleSort(a);
        //print sorted array with the help  of for each
        for(int i : a){
            System.out.print(i+ " ");
        }
    }
}
