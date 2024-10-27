package Recursion;

import java.util.Scanner;

public class RemoveOccurences {

    public static String Remove_A2(String s){
        //base case
        if (s.length() ==0) return "";

        //recursive work
        String smallAns = Remove_A2(s.substring(1));
        // current element
        char currChar = s.charAt(0);

        // self work
        if (currChar != 'a'){
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    public static String Remove_A(String s,int idx){
        //base case
        if (idx == s.length()){
            return "";
        }

        // recursive work or sub problem
        String smallAns = Remove_A(s,idx+1);
            // current element
        char currChar = s.charAt(idx);

        // self work
        if (currChar != 'a'){
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String s = sc.nextLine();
            // call
     //   System.out.println(Remove_A(s,0));

        //call
        System.out.println(Remove_A2(s));
    }
}
