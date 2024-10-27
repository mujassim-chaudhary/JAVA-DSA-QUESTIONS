package Function;

public class butterfly {
    public static void butterfly(int r){
        //1st half
        for (int i=1;i<=r;i++){
            //stars i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces -2(n-i)
            for (int j=1;j<=2*(r-i);j++){
                System.out.print(" ");
            }
            //stars -i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=r;i>=1;i--){
            //stars i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces -2(n-i)
            for (int j=1;j<=2*(r-i);j++){
                System.out.print(" ");
            }
            //stars -i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(5);
    }
}
