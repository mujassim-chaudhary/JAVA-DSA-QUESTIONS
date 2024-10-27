package Function;

public class Diamond {
    public static void diamond(int r){
        for (int i=1;i<=r;i++){
            //spaces - r-i
            for (int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            //stars - 2*i-1
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=r;i>=1;i--){
            //spaces - r-i
            for (int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            //stars - 2*i-1
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
