package quick_Sort;

public class Array_Sort {

    public static void displayArr(int[] arr){
        for (int var : arr){
            System.out.print(var+ "  ");
        }
    }

    public static void swap(int[] arr,int x, int y){
        int temp  = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr ,int st, int end){
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st+1; i<=end;i++){
            if (arr[i] <=pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr,st,pivotIdx);

        //two pointer
        int i =st ,j = end;
         // element lesseror equal left of pivotIdx , greater ->right side of pivotIdx
        while (i < pivotIdx && j > pivotIdx){
            while
            (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        return pivotIdx ;
    }

    public static void quickSort(int[] arr,int st, int end){
        if (st >= end) return;

        // pi -> pivot index
        int pi = partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,5,5,4,3,2};
        int n  = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr); // 4 1 3 5 2
        System.out.println();
        quickSort(arr,0,n-1);
        System.out.println("Array after Sorting");
        displayArr(arr);
    }
}
