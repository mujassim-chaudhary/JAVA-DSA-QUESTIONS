package Recursion;

public class BrutForceGCD {


    public static void Gcd(int x ,int y) {

        for (int i = x; i>=1;i--){
            if (x%i==0 && y%i==0){
                System.out.println(i);
                return;
            }
        }

    }

    public static void main(String[] args) {
        Gcd(12,16);
    }
}
