package Recursion;

public class Fibonacci {

    static int fib(int n) {

        //base case
        if (n == 0 || n == 1) {
            return n;
        }

        // direct return
        return fib(n - 1) + fib(n - 2);
    }

//        //small problem => recursive work
//        int pre = fib(n-1);
//        int pre_pre = fib(n-2);
//
//        //self work => big problem
//        int ans = pre +pre_pre;
//
//        return ans;
//    }

    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            System.out.println(fib(i));
        }
    }
}
