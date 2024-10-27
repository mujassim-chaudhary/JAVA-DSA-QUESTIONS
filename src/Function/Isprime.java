package Function;

import org.w3c.dom.ls.LSOutput;

public class Isprime {
//    public static boolean prime (int n){
//        for (int i=2;i<=(n-1);i++){
//            if(n%i==0){//completely divide
//                return false;
//            }
//        }
//        return true;
//    }
    public static void prime (int n){
        if (n==2){
            System.out.println("prime ");;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){//completely divide
                System.out.println("not prime ");
            }
        }
        System.out.println("prime");
    }

    public static void main(String[] args) {
        prime(11);
    }
}
