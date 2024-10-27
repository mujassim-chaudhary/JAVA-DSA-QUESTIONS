package Array2D;

import java.util.Scanner;

public class RectangleSum {

    public static void findPrefixSum(int [][] Matrix){
        int r= Matrix.length;
        int c=Matrix[0].length;
        //traverse horizontal to calculate row-wise prefix sum
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                Matrix[i][j]+=Matrix[i][j-1];
            }
        }
    }

    public static int findSum(int[][] Matrix,int l1,int l2,int r1,int r2){
        int sum=0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum+=Matrix[i][j];
            }
        }
        return sum;
    }
    //pre calculating method
    public static int findSum2(int[][] Matrix,int l1,int l2,int r1,int r2){
        int sum=0;
        findPrefixSum(Matrix);
        for (int i=l1;i<=l2;i++){
            //r1 to r2 sum for row 1
            if (r1>=1)
                sum+= Matrix[i][r2]-Matrix[i][r2-1];
            else
                sum+=Matrix[i][r2];
        }
        return sum;
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

        System.out.println("define rectangle boundaries l1 l2 r1 r2 ");
        int l1= sc.nextInt();
        int l2= sc.nextInt();
        int r1= sc.nextInt();
        int r2= sc.nextInt();

        System.out.println("rectangle sum "+findSum(Matrix,l1,l2,r1,r2));
        System.out.println("rectangle sum2 "+findSum2(Matrix,l1,l2,r1,r2));
    }
}
