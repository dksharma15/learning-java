package string;

public class indexOf_ComapreTo {
    public static void main(String[] args) {
       String str = "dipanshu sharma";
       System.out.println(str.indexOf('i'));
       System.out.println(str.indexOf('a'));// index of char when it appears first
       System.out.println(str.lastIndexOf('a')); // index of char when it appears first from the last

       String a = "abc";
       String b = "aba";
       // what compre to does string1 first char ascii value - string2 first char ascii
       // if both string same then 0 and moves to next char of string
       /*
       abc      abc     0
       abc      abcqwe  -3
       abcwe    abc     2
       abc      def     -3
       abc      aba     2
       */

       System.out.println(a.compareTo(b));
    }
}
