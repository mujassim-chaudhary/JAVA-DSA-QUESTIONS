package PatternQuestion;
import java.util.Scanner;
//pyramid question

public class question5 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int r = sc.nextInt();

           for (int i=1; i<=r;i++){
               //prinnt (r-i) spaces
               for (int j=1;j<=r-i;j++){
                   System.out.print(" ");
               }
               //print (2*i-1) stars
               for (int k =1;k<=2*i-1;k++){
                   System.out.print("*");
               }
               System.out.println();
           }
    }
}
