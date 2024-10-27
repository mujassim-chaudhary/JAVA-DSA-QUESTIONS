package SortingProblem;

public class SwapExceptTwo {

    public static void disply(int[] arr){
        for (int val :arr ){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    public static void Sortarr(int[] arr){
        int n = arr.length;
        int x =-1;
        int y =-1;

        if (n <=1){  // Conor case ,edge case
            return;
        }

        // process of all adjacent element
        for (int i =1; i<n;i++){
            if (arr[i-1]>arr[i]){
                if (x == -1){  //first conflict
                    x =i-1;
                    y =i;
                } else {  //second conflict
                    y = i;
                }
            }
        }
       // swap arr[x] ,arr[y]
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={10, 4,5,7,9,3};

        Sortarr(arr);
        disply(arr);

    }
}
