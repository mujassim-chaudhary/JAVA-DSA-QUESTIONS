package Array2D;

import java.util.Scanner;

public class Arrayinitialize {
    public static void Print(int[][] arr){

    }

    public static void main(String[] args) {
//        int[][] arr ={{1,2,3},
//                      {4,5,6},
//                       {7,8,9}
//                      };

           Scanner sc = new Scanner(System.in);
        System.out.println("enter row ");
        int r = sc.nextInt();
        System.out.println("enter column");
        int c= sc.nextInt();
        System.out.println("enter "+r*c+" element");
        int[][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("output Array");
        for (int i =0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
