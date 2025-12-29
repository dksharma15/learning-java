package array;


public class reverseOFarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
