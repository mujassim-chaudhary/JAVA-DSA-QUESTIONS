package Conditionals;

import java.util.Scanner;

public class Threepointonaline {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           double x1=1,x2=2,x3=3,y1=1,y2=2,y3=3;
           double m1 = (y2-y1)/(x2-x1);
           double m2 = (y3-y2)/(x3-x2);
           if(m1==m2){
               System.out.println("these three point lie on a single line ");
           }
           else {
               System.out.println("do not lie on a single line ");
           }
    }
}
