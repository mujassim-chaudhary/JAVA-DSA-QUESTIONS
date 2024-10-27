package Array;

import java.util.Arrays;

public class Cloning {
    public static void printArray(int []arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr=new int [5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;

        System.out.println("Orignal Array");
        printArray(arr);

        //trying to copy arr to arr_2 by cloning
        //int []arr_2 =arr.clone();
                  //OR
        //tring to copy arr to arr_2 by copyof

        //int []arr_2= Arrays.copyOf(arr,arr.length);
                  //OR
        int []arr_2=Arrays.copyOfRange(arr,0,arr.length);
        System.out.println("copied array");
        printArray(arr_2);

        //changing some value of arr_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("origanal array after changing arr_2");
        printArray(arr);

        System.out.println("copied array after changing arr_2");
        printArray(arr_2);

    }
}
