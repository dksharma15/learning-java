package array;

public class nextgreatestelement {
    public static void main(String[] args) {
        // ================method 1=================
        int[] arr = {12,8,60,37,2,49,16,28,21};
        int[] ans = new int[arr.length];
        // for(int i=0; i<arr.length; i++){
        //     int greatest = Integer.MIN_VALUE;
        //     for(int j=i+1; j<arr.length; j++){
        //         greatest = Math.max(greatest, arr[j]);
        //     }
        //     if(i==arr.length-1) ans[i] = -1;
        //     else
        //     ans[i] = greatest;
        //     System.out.print(ans[i]+" ");
        // }
        
        //=====================method 2==========
        ans[arr.length-1] = -1;
        int nge = arr[arr.length-1];
        for(int i =arr.length-2; i>=0; i--){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        for(int ele:ans){
            System.out.print(ele+" ");
        }

    }
}
