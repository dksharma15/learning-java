package string_and_stringbuilder;

public class equals {
    public static void main(String[] args) {
        // this retruns true bcz only one string abc is made and both s and t points to same string.
        // String s = "abc";
        // String t = "abc";
        // System.out.println(s==t);

        // although they are same but this now returns false bcz they both are different strings now and not same 
        // therefore we use equals();

        String s = "abcxyz";
        String t = "abc";
        t += "xyz";
        System.out.println(s);
        System.out.println(t);
        System.out.println(s==t); //false
        System.out.println(s.equals(t)); //true
        System.out.println(s.compareTo(t)); //0



    }
}
