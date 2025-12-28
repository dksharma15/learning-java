package array;

import java.util.Arrays;

public class builtinMethods {
   public static void main(String[] args) {
    int[] arr = {0,7,2,1,4,9,6,3};
    // for each loop
    for(int ele : arr){
        System.out.print(ele+" ");
    }
    
    Arrays.sort(arr);
    System.out.println();
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
   } 
}
