package Conditionals;

import java.util.Scanner;

public class Biggestof3bynestedif {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter a vslue of a : ");
        int a = sc.nextInt();
        System.out.println("enter a value of b : ");
        int b = sc.nextInt();
        System.out.println("enter a value of c : ");
        int c = sc.nextInt();
//        if(a>b){
//            if(a>c){
//                System.out.println(a+" a is big ");
//            }
//            else {
//                System.out.println(c+" c is big ");
//            }
//        }
//        else {
//            if(b>c){
//                System.out.println(b+" b is big ");
//            }
//            else {
//                System.out.println(c+" c is big ");
//            }
//        }
        // with && operator
        if(a>b&&a>c){
            System.out.println(a+", a is biggest number :");
        } else if (b>a&&b>c) {
            System.out.println(b+", b is biggest number : ");
        }else {
            System.out.println(c+",c is biggest number : ");
        }
    }
}
