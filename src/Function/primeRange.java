package Function;

public class primeRange {
    public static boolean prime (int n){
        for (int i=2;i<=(n-1);i++){
            if(n%i==0){//completely divide
                return false;
            }
        }
        return true;
    }
    public static void primerange(int n){//helper function of prime function
        for (int i=2;i<=n;i++){
            if (prime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        primerange(100);
    }

}
