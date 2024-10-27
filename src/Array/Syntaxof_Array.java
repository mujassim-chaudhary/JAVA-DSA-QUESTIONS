package Array;

public class Syntaxof_Array {
    public static void MultiArray(){
        int[][] aar_1= new int [5][3];
        int [][]arr ={{23,43,35},{12,11,23},{45,46,47}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

    }
    public static void demoArray(){
        //int[] ages=new int [3];//syntax of size of array
        int ages[]=new int [3];
        String[] names={"mujassim","vishal","ritik"};
        ages[0]=12;
        ages[1]=15;
        ages[2]=25;
        System.out.println(ages.length);
        System.out.println(names.length);
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        //String
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }

    public static void main(String[] args) {
        demoArray();
       // MultiArray();
    }
}
