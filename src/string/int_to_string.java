package string;

import java.util.Scanner;

public class int_to_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // method 1
        // String s = ""+x;

        String s = Integer.toString(x);
        System.out.println(s);
        sc.close();
    }

}
