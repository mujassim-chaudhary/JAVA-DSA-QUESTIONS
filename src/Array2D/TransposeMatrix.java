package Array2D;

import java.util.Scanner;

public class TransposeMatrix {
    public static void PrintMatrix(int[][] arr ){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] findtranspose(int[][] Matrix,int r,int c){
        int[][] transpose=new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                transpose[i][j]=Matrix[j][i];
            }
        }
        return transpose;
    }

    //transpose by in place
     public static void transposeInplace(int[][] Matrix,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                //swap matrix[i][j],matrix[j][i]
                int temp =Matrix[i][j];
                Matrix[i][j]=Matrix[j][i];
                Matrix[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row and column of Matrix of 1");
        int r = sc.nextInt();
        int c=sc.nextInt();
        int[][] Matrix =new int[r][c];
        System.out.println("enter"+r*c+" Matrix value");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                Matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("input Matrix");
        PrintMatrix(Matrix);
//        System.out.println("Transpose Matrix");
//        int[][] transpose=findtranspose(Matrix,r,c);
//        PrintMatrix(transpose);
        System.out.println("transpse matrix");
        transposeInplace(Matrix,r,c);
        PrintMatrix(Matrix);

    }
}
