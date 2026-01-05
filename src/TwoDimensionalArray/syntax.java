package TwoDimensionalArray;

import java.util.Scanner;

public class syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        int[][] brr = {{1,2,3},{4,5,6}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        int m = arr.length; // rows
        int n = arr[0].length; // colms
        System.out.println(m+" "+n);

        // arr[0][0] = 10;
        // arr[0][1] = 20;
        // arr[0][2] = 30;

        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
        sc.close();

    }
}
