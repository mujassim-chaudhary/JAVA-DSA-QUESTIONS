package Some_n_sqr_Sorting;

public class Sort_Fruits {

    public static void fruits_Sort(String[] fruits){
        int n = fruits.length;

        for (int i =0 ;i<n-1;i++){
            int min_index = i;

            for (int j = i+1;j<n;j++){
                if (fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;
                }
            }
            //swap them
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"kiwi", "apple", "papaya", "mango","orange","banana","pineapple"};

        fruits_Sort(fruits);

        for (String var : fruits){
            System.out.print(var+ " ");
        }
    }
}
