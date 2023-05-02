import java.util.ArrayList;
import java.util.*;

public class MultidiArraylst {
    public static void main(String arg[]) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);  list.add(2);
        // mainlist.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);  list2.add(4);
        // mainlist.add(list2);
        
        // for(int i=0; i<mainlist.size(); i++){
        //     ArrayList<Integer> currentlist = mainlist.get(i);
        //     for(int j=0; j<currentlist.size(); j++){
        //         System.out.print(currentlist.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainlist);

        // we are creating multiple dimentional arraylist....

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);//1 2 3 4 5
            list2.add(i*2);//2 4 6 8 10
            list3.add(i*3);//3 6 9 12 15
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        list1.remove(3);
        list2.remove(2);

        System.out.println(mainlist);

        for(int j=0; j<mainlist.size(); j++){
            ArrayList<Integer> currentlist = mainlist.get(j);
            for(int i=0; i<currentlist.size(); i++){
                System.out.print(currentlist.get(i)+" ");
            }
            System.out.println();
        }
    }
    
}
