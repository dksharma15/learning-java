package string;

import java.util.Scanner;

public class no_of_vowels {
    public static boolean vowel(char ch){
        if(ch=='a' || ch=='A') return true;
        else if(ch=='e' || ch=='E') return true;
        else if(ch=='i' || ch=='I') return true;
        else if(ch=='o' || ch=='O') return true;
        else if(ch=='u' || ch=='U') return true;
        else return false;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int count = 0;
       
       for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(vowel(ch)) count++;
       }
       System.out.println(count);
       sc.close();
    }
}
