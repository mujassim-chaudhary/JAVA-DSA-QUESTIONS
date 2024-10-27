package Array;

public class TraversingArray {
    public static void MultiArray(){
        int[][] aar_1= new int [5][3];
        int [][]arr ={{23,43,35},{12,11,23},{45,46,47}};
        //for loop
        for (int i=0; i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }
        }

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){//inner loop length
                System.out.println(arr[i][j]);
            }
        }

    }
    public static void demoArray(){
        //int[] ages=new int [3];//syntax of size of array
        int ages[]=new int [3];
        String[] names={"mujassim","vishal","ritik"};
        ages[0]=12;
        ages[1]=15;
        ages[2]=25;
        //for loop
        for (int i=0;i<3;i++){
            System.out.println(ages[i]);
        }
              //OR
        for (int i=0;i< ages.length;i++){
            System.out.println(ages[i]);
        }
        //for each loop
        for (int age : ages){//for complete array print
            System.out.println(age);
        }


    }

    public static void main(String[] args) {
        //demoArray();
         MultiArray();
    }
}
