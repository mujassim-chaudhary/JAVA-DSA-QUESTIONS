package Recursion;

public class PowerOfTwoNum {

    // simple approach
//    public static int pow(int p ,int q){
//        //base case
//        if (q == 0) return 1;
//
////        //recursive work or sub problem
////        int smallAns = pow(p,q-1);
////
////        //self work
////        int ans = smallAns * p;
////
////        return ans;
//
//        // direct work
//        return pow(p,q-1) *p;
//    }

    //better approach
    public static int pow(int p ,int q){
        //base case
        if (q == 0) return 1;

        int smallPow = pow(p,q/2);

        if (q%2 ==0){
            return smallPow*smallPow;
        } else {
            return p * smallPow* smallPow;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }
}
