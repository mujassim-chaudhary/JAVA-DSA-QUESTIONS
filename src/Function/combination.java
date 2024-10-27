package Function;

import java.util.Scanner;

public class combination {
    public static int factorial(int n){//logic funtion
        int f=1;
        for (int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static int binomial(int n,int r){  //helper function
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);

        int binocoff = n_fact/(r_fact*nmr_fact);
        return binocoff;
    }

    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        System.out.println("enter r :");
        int r = sc.nextInt();
        int  combination =binomial(n,r);
        System.out.println("binomial combination is :"+combination);
    }
}
