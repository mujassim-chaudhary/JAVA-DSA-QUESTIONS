package Function;

public class inverted_number {
    public static void invertednumber(int r){
        for (int i=1;i<=r;i++){
            for (int j=1;j<=(r-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertednumber(5);
    }
}
