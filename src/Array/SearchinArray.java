package Array;

public class SearchinArray {
    public static void search(){
        //linear search
        int[]arr={1,4,6,4,8,9};
        int x=89;
        int ans =-1;

        for (int i=0;i< arr.length;i++){
            if (arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("found "+x+" at index "+ans);
    }

    public static void main(String[] args) {
        search();
    }


}
