package methods;

import java.util.Scanner;

public class arguments {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = sum(x,y);
        System.out.println(result);

        sc.close();

    }
}
