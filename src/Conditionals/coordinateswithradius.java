package Conditionals;

import java.util.Scanner;

public class coordinateswithradius {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int x=7,y=5;
           int radius =4;
        System.out.println("enter x1 : ");
        int x1 = sc.nextInt();
        System.out.println("enter y1 :");
        int y1 = sc.nextInt();
        if(((x-x1)*(x-x1) +(y-y1)*(y-y1))>radius*radius){
            System.out.println("point lies out side the circle :");
        } else if (((x-x1)*(x-x1) +(y-y1)*(y-y1))<radius*radius) {
            System.out.println("pooint lies inside the circle ");
        }else {
            System.out.println("point lies on the surface");
        }
    }
}
