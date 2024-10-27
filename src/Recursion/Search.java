package Recursion;

public class Search {

    // print all indices of target present in array
    public static void findAllIndices(int[] arr,int target , int idx){
        //base case
        if (idx >= arr.length){
            return;
        }

        //self work
        if (arr[idx] == target){
            System.out.println(idx);
        }

        //recursive work
        findAllIndices(arr,target,idx+1);
    }

    //find first index -> return index of target if target present in array, otherwise return -1
    public static int FindIndex(int[] arr ,int target , int idx){
        //base case
        if (idx ==arr.length) return -1;

        //self work
        if (arr[idx] == target) return idx;

        //recursive work
        return FindIndex(arr,target,idx+1);

    }

    //if target is present return true or false
    public static boolean Search(int[] arr ,int target , int idx){
        //base case
        if (idx ==arr.length) return false;

        //self work
        if (arr[idx] == target) return true;

        //recursive work
         return Search(arr,target,idx+1);

         // Or recursive work
//        if (Search(arr,target,idx+1)){
//            return true;
//        } else{
//            return false;
//        }

    }

    public static void main(String[] args) {
        int[] arr ={1,3,8,5,8,2,8};
        int target = 8;

           // third question
        findAllIndices(arr,target,0);

            //second question
     //   System.out.println(FindIndex(arr,target,0));


             // first question
//        if (Search(arr,target,0)){  // true
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
    }
}
