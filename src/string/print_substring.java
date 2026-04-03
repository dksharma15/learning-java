package string;

import java.util.Scanner;

public class print_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c=1;
        
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                System.out.println(c + ". " + str.substring(i,j+1));
                c++;
            }
        }
        sc.close();
    }
}
