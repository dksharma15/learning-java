package array;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array - ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter elements of array - ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i]>max){
                smax = max ;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>smax) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
        sc.close();
    }
}
