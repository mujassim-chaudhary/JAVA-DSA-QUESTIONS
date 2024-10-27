package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        // wrapper classes
        Integer in =Integer.valueOf(4);
        System.out.println(in);
        Float f =Float.valueOf(4.3f);
        System.out.println(f);

        //how to create arraylist
        ArrayList<Integer> l1= new ArrayList<>();

        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i
        System.out.println(l1.get(1)); // 6

        //print with for loop
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i)); //5 6 7 8
        }

        //print the arraylist directly
        System.out.println(l1); //[5 6 7 8]

        //adding element at index i
        l1.add(1,100);
        System.out.println(l1);//[5 100 6 7 8]

        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1); //[5 10 6 7 8]

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);  //5 6 7 8

        //removing an element e
        l1.remove(Integer.valueOf(7));//it can be boolean type
        System.out.println(l1);//5 6 8

        //checking if an element exists
        boolean ans =l1.contains(Integer.valueOf(45));
        System.out.println(ans);

        //if you don't specify class ,you can put anything inside it
        ArrayList l=new ArrayList();
        l.add(" mujassim");
        l.add(5);
        l.add(true);
        System.out.println(l);



    }

}
