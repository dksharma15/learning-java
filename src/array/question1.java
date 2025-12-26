package array;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students - ");
        int x = sc.nextInt();

        int[] marks = new int[x];
        for(int i=0; i<x; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<x; i++){
            if(marks[i]<35){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
