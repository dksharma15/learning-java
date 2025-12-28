package array;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        System.out.println(list+" "+list.size());
        list.add(30);
        System.out.println(list+" "+list.size());
        list.add(20);
        System.out.println(list+" "+list.size());
        
        list.remove(1);
        System.out.println(list+" "+list.size());

    }
}
