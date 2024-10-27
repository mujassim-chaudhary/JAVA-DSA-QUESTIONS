package Switch.java;

import java.util.Scanner;

public class CharDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        char Day = sc.next().charAt(0);
        switch (Day){
            case 'm' :
                System.out.println("Monday");
                break;
            case 't' :
                System.out.println("Tuesday");
                break;
            case  'w' :
                System.out.println("Wednesday");
                break;
            case 'T' :
                System.out.println("Thursday");
                break;
            case 'f' :
                System.out.println("Friday");
                break;
            case 's' :
                System.out.println("Saturday");
                break;
            case 'S' :
                System.out.println("sunday");
                break;
            default :
                System.out.println(" The invalid Day :");

        }
    }
}
