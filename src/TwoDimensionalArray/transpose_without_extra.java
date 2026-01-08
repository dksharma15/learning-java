package TwoDimensionalArray;

public class transpose_without_extra {
    public static void print(int[][] arr){
        
        for (int[] ele: arr) {
            for ( int x : ele) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        print(arr);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <=i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print(arr);
    }
}
