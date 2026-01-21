package TwoDimensionalArray;

import java.util.Scanner;

public class leetcode_spiralMatrix{
    public static void input(int[][]arr, Scanner sc){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];

        input(arr, sc);
        print(arr);

        int minr = 0, maxr = m-1, minc = 0, maxc = n-1;
        while(minr<=maxr && minc<=maxc){
            for(int j=minc; j<=maxc; j++)
                System.out.print(arr[minr][j]+" ");
            minr++;

            if(minr>maxr || minc>maxc) break;
            for(int i=minr; i<=maxr; i++)
                System.out.print(arr[i][maxc]+" ");
            maxc--;
            
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc; j>=minc; j--)
                System.out.print(arr[maxr][j]+" ");
            maxr--;
            
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr; i>=minr; i--)
                System.out.print(arr[i][minc]+" ");
            minc++;
        }

        sc.close();
    }
}