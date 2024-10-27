package javainput;
import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double radius;
        System.out.print("enter the valuie of radius : ");
        radius =sc.nextDouble();
        double pi =3.14;
        double area = pi*radius*radius;
        System.out.println(" The area of circle : "+area);
    }
}
