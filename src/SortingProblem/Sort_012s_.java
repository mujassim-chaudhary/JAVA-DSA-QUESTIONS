package SortingProblem;

public class Sort_012s_ {

    public static void disply(int[] arr){
        for (int val :arr ){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    public static void sort(int[] arr){
        int count_0 = 0, count_1 =0, count_2=0;

        for (int j: arr){
            if (j == 0){
                count_0++;
            } else if (j == 1) {
                count_1++;
            } else if (j == 2) {
                count_2++;
            }
        }

        int k=0;
        while (count_0 > 0){
            arr[k++] = 0;
            count_0--;
        }
        while (count_1 > 0){
            arr[k++] = 1;
            count_1-- ;
        }
        while (count_2 > 0){
            arr[k++] = 2;
            count_2--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,1,2,0,0,2,1,0,1,2,2,0};

        sort(arr);
        disply(arr);

    }
}
