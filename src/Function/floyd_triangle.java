package Function;

public class floyd_triangle {
    public static void triangle(int r){
        int counter=1;
        for (int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(5);
    }
}
