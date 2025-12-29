package array;

public class rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        int[] brr = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(i<k) brr[i] = arr[arr.length-k+i];
            else brr[i] = arr[i-k];
        }

        for(int ele:brr){
            System.out.print(ele+" ");
        }

    }
}
