package methods;

import java.util.Scanner;

public class maxOFthreeBUILT_IN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = Math.max(Math.max(c, b),Math.max(a, d));
        System.out.println(max);
        sc.close();

    }
}
