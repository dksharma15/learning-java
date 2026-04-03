package string;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "abcde";
        System.out.println(s.substring(1));// prints from begin to end
        System.out.println(s.substring(1,3)); // prints from begin to end-1

        sc.close();
    }
}
