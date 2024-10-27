package Function;

import java.util.Scanner;

public class factorial {
    public static int factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
           int n = sc.nextInt();
           int fact =factorial(n);
        System.out.println("the factorial is : "+fact);
    }
}
