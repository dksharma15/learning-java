package array;

public class sort_0sand1s {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1};
        // ============SOLUTION 1============= 
        // int zero = 0;
        // for(int ele:arr){
        //     if(ele==0) zero++;
        // }

        // for(int i = 0; i<arr.length; i++){
        //     if(i<zero) 
        //         arr[i] = 0;
        //     else
        //         arr[i] = 1;
        // }

        // ===========SOLUTION 2==============

        int low = 0;
        int high = arr.length-1;

        while(low<high){
            if(arr[low]==0){
                low++;
            }
            else if(arr[high]==1){
                high--;
            }
              
            else if(arr[low]==1 && arr[high]==0){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
