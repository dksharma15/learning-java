package array;

public class leetcode_RotateArray {
    public static void reverse(int[] arr, int low, int high){
        while(low<=high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        k = k % arr.length; // if k is gretaer than length this will handle

        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    
}
