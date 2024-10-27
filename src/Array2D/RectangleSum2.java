package Array2D;

import java.util.Scanner;

public class RectangleSum2 {
    public static void findPrefixSum(int[][] Matrix) {
        int r = Matrix.length;
        int c = Matrix[0].length;
        //traverse horizontal to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                Matrix[i][j] += Matrix[i][j - 1];
            }
        }
        //traverse vertically to calculate col-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                Matrix[i][j] += Matrix[i - 1][j];
            }
        }
    }

    public static int findsum3(int[][] Matrix, int l1,int l2,int r1,int r2){
        int ans=0,sum=0,up=0,left=0,leftup=0;
        findPrefixSum(Matrix);
        //l1=row, r1=col
        sum=Matrix[l2][r2];
        if (r1>=1)
            left=Matrix[l2][r1-1];
        if (l1>=1)
            up=Matrix[l1-1][r2];
        if (l1>=1&&r1>=1)
            leftup=Matrix[l1-1][r1-1];

        ans=sum-up-left+leftup;

        return ans;
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
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("rectangle sum " + findsum3(Matrix, l1, l2, r1, r2));

    }
}



