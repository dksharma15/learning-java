package methods;

import java.util.Scanner;

public class swap {
    public static void swaping(int x, int y){
        int temp = y;
        y = x;
        x = temp;
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+" "+b);

        swaping(a, b);

        sc.close();
    }
    
}
