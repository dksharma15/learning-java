package array;

public class leetcode_SortColor {
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,0,1,2,2,2,0,1,2,0,1};
        // =============METHOD 1====================
        // int zero = 0;
        // int one = 0;
        // int two = 0;
        // for(int ele:nums){
        //     if(ele==0) zero++;
        //     else if(ele==1) one++;
        //     else two++;
        // }
        // for(int i=0; i<zero; i++){
        //     nums[i] = 0;
        // }
        // for(int i=zero; i<zero+one; i++){
        //     nums[i] = 1;
        // }
        // for(int i=nums.length-two; i<nums.length; i++){
        //     nums[i] = 2;
        // }

        // ================METHOD 2===========
        int low = 0, mid=0, high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
