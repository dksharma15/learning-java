package string;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // char[] ch = {'h','e','l','l','o'};
        // for(int i=0; i<ch.length; i++){
        //     System.out.print(ch[i]);
        // }
        Scanner sc = new Scanner(System.in);
        String str = "hello";
        // String s = sc.next(); //next used for one word till space and nextLine for full sentence.
        String s = sc.nextLine();

        System.out.println(str+" "+s);
        sc.close();
    }
}
