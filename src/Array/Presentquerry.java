package Array;

import java.util.Scanner;

public class Presentquerry {

    public static int[] makeFrequencyArray(int[] arr){
        int [] freq =new int[100005];
        for (int i=0;i< arr.length;i++){
            freq[arr[i]]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :" );
        int n= sc.nextInt();
        int [] arr=new int[n];

        System.out.println("enter "+n+" element");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int[] freq =makeFrequencyArray(arr);

        System.out.println("enter number of querry : " );
        int q= sc.nextInt();

        while(q>0){
            System.out.println("enter number to be searched ");
            int x = sc.nextInt();
            if (freq[x]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }
}
