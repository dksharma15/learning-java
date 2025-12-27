package array;

import java.util.Scanner;

public class maxOFarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array - ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter elements of array - ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int a = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
           // if(arr[i]>=a) a = arr[i];
           a = Math.max(a, arr[i]);
        }

        System.out.println(a);
        
        sc.close();
    }
}
