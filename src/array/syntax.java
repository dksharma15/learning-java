package array;

import java.util.Scanner;

public class syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 43;
        arr[2] = 32;
        arr[3] = 32;
        arr[4] = 12;

        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }

        int[] arr2 = new int[5];

        for(int i = 0; i<5; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i=0; i<5; i++){
            System.out.println(arr2[i]);
        }

        int[] arr3 = {1,2,3,4,5,6,7,8,9};
        int lenght = arr3.length;
        System.out.println(arr3[2]+" "+lenght);

        sc.close();

    }
}
