package Operators;

public class logicalOpt {
    public static void main(String[] args) {
        int p =15, q =10,r =5;

        //&&Opt
        System.out.println((p>q) && (p>r));//true
        System.out.println((p>q) && (p<r));//false

        // ||Opt
        System.out.println((r<q) || (p<q));//true
        System.out.println((p>q) || (q>r));//ture
        System.out.println((p<q) || (q<r));//false

        // !Opt
        System.out.println(!(p==q));//true
        System.out.println(!(p>q));//false

    }
}
