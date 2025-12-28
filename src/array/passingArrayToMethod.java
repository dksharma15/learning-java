package array;

public class passingArrayToMethod {
    public static void change(int[] x){
        x[0] = 10;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
}
