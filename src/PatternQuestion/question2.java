package PatternQuestion;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r= sc.nextInt();//number of Row
        int c= sc.nextInt();//number of column

        for (int i =1;i<=r;i++)//this loop is for row
        {
            for (int j=1;j<=c;j++)//this loop is for column
            {
                if (i==1||i==r||j==1||j==c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
