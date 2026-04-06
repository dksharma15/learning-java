package string_and_stringbuilder;

public class max {
    public static String ans(String a, String b){
        String s = purify(a), t = purify(b);
        if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>t.charAt(i)) return a;
            if(s.charAt(i)<t.charAt(i)) return b;
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    public static String purify(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
    
    public static void main(String[] args) {
        String[] s = {"132","52","21360","2365","999"};
        String max_string = s[0];
        for(int i=0; i<s.length; i++){
            max_string = ans(max_string, s[i]);
        }
        System.out.println(max_string);
    }
}
