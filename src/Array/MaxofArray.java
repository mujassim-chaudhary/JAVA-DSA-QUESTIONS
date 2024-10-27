package Array;

public class MaxofArray {
    public static void MaxValue(){
        int[]arr={1,4,6,4,8,9};
        int ans=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        MaxValue();
    }
}
