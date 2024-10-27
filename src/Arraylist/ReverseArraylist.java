package Arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArraylist {

    public static void Reverselist(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while(i<j){
            Integer temp =Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original Arraylist " +list);
     //   Reverselist(list);
        Collections.reverse(list);
        System.out.println("Reversed Arraylist "+list);
        Collections.sort(list);
        System.out.println("Ascending order "+list);
        Collections.sort(list ,Collections.reverseOrder());
        System.out.println("descending order "+list);

        //Arraylist of string in desecending order
        ArrayList<String> l1 =new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("Original String"+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("sorted "+l1);

    }

}
