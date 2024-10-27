package Some_n_sqr_Sorting;

public class MoveAllZeroes_AtEnd {

    public static void ZeroesAtEnd(int[] arr){
        int n = arr.length;

        for (int i = 0; i <n-1 ; i++) {
            boolean flag = false;
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j] == 0 && arr[j+1] !=0){
                    //swap them
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }

            }

            if(flag == false){
                return;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {0,5,0,3,42,100,0,4,5};

        ZeroesAtEnd(arr);

        for (int i : arr){
            System.out.print(i+ " ");
        }

    }
}
