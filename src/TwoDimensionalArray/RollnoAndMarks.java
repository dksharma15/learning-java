package TwoDimensionalArray;

import java.util.Scanner;

public class RollnoAndMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() , n = sc.nextInt();
        int[][] marks = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                marks[i][j] = sc.nextInt();
            }
        }
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(marks[i][j]+" ");;
        //     }
        //     System.out.println();
        // }

        for(int[] ele:marks){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
