package Function;

public class Hellorectangle {
    public static void hello_rectangle(int r,int c){
        for (int i=1;i<=r;i++){
            for (int j =1;j<=c;j++){
                if (i==1||i==r||j==1||j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hello_rectangle(4,5);
    }
}
