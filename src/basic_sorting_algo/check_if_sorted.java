package basic_sorting_algo;

public class check_if_sorted {
    public static boolean check(int[]arr){
        boolean check = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]);
            else{
                check = false;
                return check;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,6};
        if(check(arr)){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
