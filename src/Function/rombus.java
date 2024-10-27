package Function;

public class rombus {
    public static void rombus(int r){
        for (int i=1;i<=r;i++){
            //spaces - r-i
            for (int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            //stars -r
            for (int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rombus(5);
    }
}
