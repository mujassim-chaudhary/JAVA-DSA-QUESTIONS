package Recursion;

public class Factorial {

    static int fact(int n){

        //base case
        if (n == 1) return 1;

        //small problem
        int smallAns = fact(n-1);

        //big problem or recursive relation
        int ans = n * smallAns;
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(fact(5));
    }
}
