package Array2D;

import java.util.Scanner;

public class GenerateSprialMatrix {
    public static void PrintMatrix(int[][] arr ){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] Spiral(int n){
        int[][] Matrix=new int[n][n];
        int topROw=0,bottomRow=n-1,leftcol=0,rightcol=n-1;
        int curr=1;

        while (curr<=n*n){
            //topRow -> leftcol to rightcol
            for (int j=leftcol;j<=rightcol&&curr<n*n;j++){
                Matrix[topROw][j]=curr++;
            }
            topROw++;

            //rightcol ->topRow to bottomRow
            for (int i=topROw;i<=bottomRow&&curr<n*n;i++){
                Matrix[i][rightcol]=curr++;
            }
            rightcol--;

            //bottomRow -> rightcol to leftcol
            for (int j=rightcol;j>=leftcol&&curr<n*n;j--){
                Matrix[bottomRow][j]=curr++;
            }
            bottomRow--;

            //leftcol -> bottomRow to topRow
            for (int i=bottomRow;i>=topROw&&curr<n*n;i--){
                Matrix[i][leftcol]=curr++;
            }
            leftcol++;
        }
        return Matrix;

    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter n");
           int n = sc.nextInt();
           System.out.println("spiral matrix ");
           int [][] ans= Spiral(n);
           PrintMatrix(ans);

    }


    
}
