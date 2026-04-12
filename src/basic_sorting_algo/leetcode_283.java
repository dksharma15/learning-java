package basic_sorting_algo;

public class leetcode_283 {
    public static void main(String[] args) {
        int[] arr = {1,0,4,0,2,-40,100,0,5};
        for(int i=0; i<arr.length-1; i++){
            boolean flag = true;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag==true) break;
        }
        for(int ele: arr) System.out.print(ele + " ");
    }
}
