package array;

import java.util.ArrayList;

public class basicsOFarrayList {
    public static void main(String[] args) {
        //declaration
        ArrayList<Integer> al = new ArrayList<>(6);
        //initialise
        al.add(0,10);
        al.add(1,20);
        al.add(2,30);
        al.add(3,40);
        al.add(4,50);
        al.add(5,60);
       
        // set for input
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();

        // System.out.println(al);

        // modify
        al.set(2, 300);
        System.out.println(al);

        System.out.println("size before - "+al.size());
        
        al.add(90); //push back
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");
        }
        
        System.out.println("size after - "+al.size());
    }
}
