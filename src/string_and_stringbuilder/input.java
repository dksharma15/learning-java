package string_and_stringbuilder;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // method 1
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

        // method 2
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        System.out.println(str);

        sc.close();
    }
}
