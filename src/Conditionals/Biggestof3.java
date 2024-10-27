package Conditionals;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Biggestof3 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter a vslue of a : ");
        int a = sc.nextInt();
        System.out.println("enter a value of b : ");
        int b = sc.nextInt();
        System.out.println("enter a value of c : ");
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a+" the value of a is big ");
        }else if(b>a&&b>c){
            System.out.println(b+" the vale of b is big ");
        }else{
            System.out.println(c+" the value of c is big ");
        }


    }

}
