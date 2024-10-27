package Recursion;

import java.util.ArrayList;

public class Subsequenses {

    public static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();

        //base case
        if (s.length() == 0){
            ans.add("");
            return ans;
        }
        //current element
        char Curr_elem = s.charAt(0);

        //recursive work or subproblem
        ArrayList<String> smallAns = getSSQ(s.substring(1)); // faith on recursion

        //self work
        for (String ss : smallAns){
            ans.add(ss);
            ans.add(Curr_elem + ss);
        }

        return ans;
    }

    public static void main(String[] args) {
     ArrayList<String> ans = getSSQ("abc");

     for (String ss : ans){
         System.out.println(ss);
     }
    }
}
