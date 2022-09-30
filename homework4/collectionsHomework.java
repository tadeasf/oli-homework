package homework4;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsHomework {
        public static void main (String[] args){
            ArrayList<Integer> arl = new ArrayList<>();
            arl.add(10);
            arl.add(9);
            arl.add(8);
            arl.add(7);
            arl.add(5);
            arl.add(6);
            arl.add(7);
            arl.add(8);
            arl.add(9);
            arl.add(10);
            System.out.println("ArrayList contains: " + arl);
            Collections.sort(arl);
            System.out.println(("Sorted ArrayList " + "in Ascending order" + arl));
        }
}
