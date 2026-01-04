package array;

public class leetcode_MergeSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 10,15,20}; // i
        int[] brr = { 0, 2, 4, 6, 8,9,10 }; // j
        int m = arr.length, n = brr.length;
        int[] crr = new int[m + n]; // k
        int i = 0, j = 0, k = 0;
        while (i <m && j<n) {
            if (arr[i] <= brr[j]) {
                crr[k] = arr[i];
                i++;
                k++;
            }

            else {
                crr[k] = brr[j];
                k++;
                j++;
            }
        }

        if(i<m){
            while(i<m){
                crr[k] = arr[i];
                k++;
                i++;
            }
        }
        else if(j<n){
            while(j<n){
                crr[k] = brr[j];
                j++;
                k++;
            }
        }

        for (int ele : crr) {
            System.out.print(ele + " ");
        }
    }
}
