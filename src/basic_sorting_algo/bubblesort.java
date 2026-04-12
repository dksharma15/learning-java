package basic_sorting_algo;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,2,5,-1,-3};

        // BUBBLE SORT - 1 
        //time complexity O(n^2)
        // no.  of operations (n-1)^2 = n^2 - 2n + 1
        //space complexity O(n) (array given of size n)
        // for(int x=1; x<=arr.length-1; x++){
        //     for(int i=0; i<arr.length-1; i++){
        //     if(arr[i]>arr[i+1]){
        //         int temp = arr[i];
        //         arr[i] = arr[i+1];
        //         arr[i+1] = temp;
        //     }
        // }
        // }

        // BUBBLE SORT - 2 (less no. of operations)
        //time complexity O(n^2)
        // less no. of operations
        // for(int x=0; x<arr.length-1; x++){
        //     for(int i=0; i<arr.length-1-x; i++){
        //     if(arr[i]>arr[i+1]){
        //         int temp = arr[i];
        //         arr[i] = arr[i+1];
        //         arr[i+1] = temp;
        //     }
        // }
        // }

        // BUBBLE SORT OPTIMIZED
        for(int i=0; i<arr.length-1; i++){
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag==true) break;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
