package Array;

public class SumElement {
    public static void sum( ){
        int[] arr ={2,4,5};
        int sum =0;
        for (int i=0;i<3;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        sum();
    }
}
