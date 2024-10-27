package Recursion;

import java.util.Scanner;

public class Reverse_String {

    public static String reverse(String s,int idx){
        //base case
        if (idx ==s.length()) return "";

        //recursive work
        String smallAns = reverse(s,idx+1);
        //current element
        char currChar = s.charAt(idx);

        //self work
        return smallAns + currChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");

        String s = sc.nextLine();

           // reverse string
//        System.out.println(reverse(s,0));

          // is palindrom or not
        String rev = reverse(s,0);
        if (rev.equals(s)){
            System.out.printf("%s is Palindrom",s);
        } else{
            System.out.printf("%s is Not Palindrom",s);
        }
    }
}
