package Conditionals;
import java.util.Scanner;
public class Proftloss {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter cp : ");
        double cp = sc.nextDouble();
        System.out.println("enter sp : ");
        double sp = sc.nextDouble();
        if (sp > cp) {
            System.out.println("Profit is making : ");
            double profit =sp-cp;
            System.out.println("The value of profit is : "+profit);
        }else{
            System.out.println("Loss is making :");
            double loss =cp-sp;
            System.out.println("The value of loss is : "+loss);
        }
    }
}