package Recursion;

public class CountOfDigits {

    public static long cod(int n){
        // basse casse
        if (n >=0 &&n<=9) return 1;

        // sub problem
        long smallAns = cod(n/10);

        //recursive relation
        long ans = smallAns + 1;

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(cod(1234564787));
    }
}
