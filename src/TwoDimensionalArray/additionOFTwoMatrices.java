package TwoDimensionalArray;

import java.util.Scanner;

public class additionOFTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() , n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] brr = new int[m][n]; 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                brr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+brr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
