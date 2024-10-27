package Function;

public class rotatedhalf_pyramid {
    public static void inverted_halfpyramid(int r,int c){
        for (int i=1;i<=r;i++){
            //spaces
            for (int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            //stars
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_halfpyramid(5,4);
    }
}
