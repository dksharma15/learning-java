package array;

import java.util.Arrays;

public class copyOFarray {
    public static void main(String[] args) {
        int[] arr = {0,7,2,1,4,9,6,3};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        // int[] copy = arr; //shallow copy
        // copy[0] = 12;
       // System.out.println(arr[0]);

        int[] brr = Arrays.copyOf(arr,arr.length ); //deep copy
        brr[0] = 12;
        System.out.println(arr[0]); 
        for(int ele : brr){
            System.out.print(ele+" ");
        }
        //another way of deep copy

        int[] crr = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            crr[i] = arr[i];
        }

    }
}
