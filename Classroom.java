import java.util.ArrayList;
import java.util.Collections;
//import java.util.*;
 public class Classroom{
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2,temp);

    }

        public static void main(String args[]) {
            ArrayList<Integer> list = new ArrayList<>();
            //add operation
            list.add(1);//0
            list.add(5);//1
            list.add(6);//2
            list.add(9);//3
            list.add(7);//4
            list.add(8);//5
            // list.add(4,22);// by index operation

           // delete operation
        //     list.remove(3);

        //     // get operation
        //     list.get(2);

        //     //set operation
        //     list.set(5, 34);
        //     // this methode check if value exites in array then return true otherwise false
       
            System.out.println(list.contains(34));
             System.out.println(list.contains(11));
        //     System.out.println(list);

        // System.out.println(list.size());

        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");//time complexity O(n) linear time complexity
        // }
        // System.out.println();

            //this maximum number find in arraylist
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){

        //     if(max<list.get(i)){
        //         max=list.get(i);
        //     }
        //    // max = Math.max(max, list.get(i));
        // }
        //     System.out.println(max);

        // int  indx1=1, indx2=3;
        // System.out.println(list);
        // swap(list, indx1,indx2);
        // System.out.println(list);

        System.out.println(list.size());
        Collections.sort(list);//ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());//descending order
        System.out.println(list);
    }
}