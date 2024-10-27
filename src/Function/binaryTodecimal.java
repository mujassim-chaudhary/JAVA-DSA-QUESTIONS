package Function;

public class binaryTodecimal {
    public static void bintoDec(int n){
        int mynum =n;
        int pow=0;
        int decnum=0;
        while (n>0){
            int lastDigit=n%10;
            decnum =decnum +(lastDigit *(int)Math.pow(2,pow));

            pow++;
            n = n/10;
        }
        System.out.println("decimal num "+mynum+" ="+decnum);
    }


    public static void main(String[] args) {
        bintoDec(1111);
    }
}
