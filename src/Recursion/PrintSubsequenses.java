package Recursion;

public class PrintSubsequenses {

    public static void printSSQ(String s,String currAns){  // s = "abc"
        //base case
        if (s.length() ==0){
            System.out.println(currAns);
            return;
        }

        //current element
        char curr = s.charAt(0); //a
        //recursive work
        String remString = s.substring(1); //bc

// self work

        //curr char -> chooses to be a part of currAns
        printSSQ(remString,currAns + curr); // bc ,a

        //curr char -> does not choose to be a part of cuurAns
        printSSQ(remString,currAns); //bc, ""
    }

    public static void main(String[] args) {
     printSSQ("abc","");
    }
}
