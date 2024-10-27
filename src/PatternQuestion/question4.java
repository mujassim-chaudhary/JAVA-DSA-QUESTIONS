package PatternQuestion;

import java.util.Scanner;
//reverse triangular pattern
public class question4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int r= sc.nextInt();//number of Row
//
//
//        for (int i =1;i<=r;i++)//this loop is for row
//        {
//            for (int j=1;j<=(r+1-i);j++)//this loop is for column
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r= sc.nextInt();//number of Row


        for (int i =1;i<=r;i++)//this loop is for row
        {
            for (int j=i;j<=r;j++)//this loop is for column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
