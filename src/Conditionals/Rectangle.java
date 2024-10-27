package Conditionals;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        int L = sc.nextInt();
        System.out.println("enter breath : ");
        int b = sc.nextInt();
        int area = L*b;
        int perimeter =2*(L+b);
        if(area>perimeter){
            System.out.println("area is greater than perimeter is :"+area);
        }else{
            System.out.println("perimeter is greater than area  is : "+perimeter);
        }


    }
}
