package string_and_stringbuilder;
import java.util.Scanner;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii<=90) { // captial
                ascii += 32;
                ch = (char)ascii;
                s.setCharAt(i, ch);
            } 
            else{
                ascii -=32;
                ch = (char)ascii;
                s.setCharAt(i, ch);
            }
        }
        System.out.println(s);
        sc.close();
    }
}
