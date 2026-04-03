package string_and_stringbuilder;

import java.util.Scanner;

public class update_position {
    public static void main(String[] args) {
        // Q. update even positions to 'a';
        Scanner sc = new Scanner(System.in);
        String ans = "";
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++){
            if(i%2==0) ans += "a";
            else ans += s.charAt(i);
        }
        // System.out.println(ans);

        s = ans;
        System.out.println(s);

        sc.close();
    }
}
