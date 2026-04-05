package string_and_stringbuilder;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "dipanshu";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (char ele : ch) {
            System.out.print(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("fabced");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
