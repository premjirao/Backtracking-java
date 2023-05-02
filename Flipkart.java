import java.util.ArrayList;
import java.util.*;
 public class Flipkart{
    public static int storeWater(ArrayList<Integer> hieght){
            int maxwater=0;
            for(int i=0; i<hieght.size();i++){
                for(int j=i+1; j<hieght.size(); j++){
                    int ht = Math.min(hieght.get(i), hieght.get(j));
                    int width = j-i;
                    int currwater = ht*width;
                    maxwater = Math.max(maxwater,currwater);
                    
                }
            }
            return maxwater;
    }

    public static void main(String args[]){
        ArrayList<Integer> hieght = new ArrayList<>();
            //1,8,6,2,5,4,8,3,7

            hieght.add(1);
            hieght.add(8);
            hieght.add(6);
            hieght.add(2);
            hieght.add(5);
            hieght.add(4);
            hieght.add(8);
            hieght.add(3);
            hieght.add(7);
       System.out.println(storeWater(hieght));
    }
}