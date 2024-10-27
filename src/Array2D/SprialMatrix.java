package Array2D;

import java.util.Scanner;

public class SprialMatrix {

    public static void PrintMatrix(int[][] arr ){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

   public static void printSprialOrder(int[][] Matrix,int r,int c){
        int topROw=0,bottomRow=r-1,leftcol=0,rightcol=c-1;
        int totalElement=0;

        while (totalElement<r*c){
            //topRow -> leftcol to rightcol
            for (int j=leftcol;j<=rightcol&&totalElement<r*c;j++){
                System.out.print(Matrix[topROw][j]+" ");
                totalElement++;
            }
            topROw++;

            //rightcol ->topRow to bottomRow
            for (int i=topROw;i<=bottomRow&&totalElement<r*c;i++){
                System.out.print(Matrix[i][rightcol]+" ");
                totalElement++;
            }
            rightcol--;

            //bottomRow -> rightcol to leftcol
            for (int j=rightcol;j>=leftcol&&totalElement<r*c;j--){
                System.out.print(Matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;

            //leftcol -> bottomRow to topRow
            for (int i=bottomRow;i>=topROw&&totalElement<r*c;i--){
                System.out.print(Matrix[i][leftcol]+" ");
                totalElement++;
            }
            leftcol++;
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
        System.out.println("Sprial Matrix");
        printSprialOrder(Matrix,r,c);


    }
}