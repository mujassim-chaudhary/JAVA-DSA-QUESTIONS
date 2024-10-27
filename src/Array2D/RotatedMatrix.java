package Array2D;

import java.util.Scanner;

public class RotatedMatrix {
    public static void PrintMatrix(int[][] arr ){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

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
    public static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }


    public static void rotatedMatrix(int[][] Matrix,int n){
        //transpose of maatrix first
        transposeInplace(Matrix,n,n);
        //then reversed each row of transposed matrix
        for (int i=0;i<n;i++){
            reverseArray(Matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row and column of Matrix of 1");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] Matrix = new int[r][c];
        System.out.println("enter" + r * c + " Matrix value");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        PrintMatrix(Matrix);

        rotatedMatrix(Matrix,r);
        System.out.println("rotated Matrix");
        PrintMatrix(Matrix);
    }
}
