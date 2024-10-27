package Function;

public class hollow_rombus {
    public static void hollowrombus(int r){
        for (int i=1;i<=r;i++){
            //spaces -r-i
            for (int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            //hollow_stars
            for (int j=1;j<=r;j++){
                if (i==1||i==r||j==1||j==r){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowrombus(5);
    }
}
