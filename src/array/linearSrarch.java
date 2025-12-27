package array;

import java.util.Scanner;

public class linearSrarch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter x - ");
        int x = sc.nextInt();

        boolean flag = false; // false means not found
        for(int i=0; i<5; i++){
            if(arr[i]==x){
                flag = true;
                System.out.println(i);
                break;
            }
        }

        if(flag == false) System.out.println("not found");

        sc.close();
    }
}
