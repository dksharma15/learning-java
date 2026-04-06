package string_and_stringbuilder;

public class leetcode_205_isomerphic {
    public static boolean ans(String s, String t){
        if(s.length()!=t.length()) return false;
        
        char[] arr = new char[128];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int index = (int)ch;
            if(arr[index]=='\0') arr[index] = dh;
            else{
                if(arr[index]!=dh) return false;
            }
        }
        char[] brr = new char[128];
        for(int i=0; i<s.length(); i++){
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int index = (int)ch;
            if(brr[index]=='\0') brr[index] = dh;
            else{
                if(brr[index]!=dh) return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "mood";
        String t = "race";

        System.out.println(ans(s,t));
    }
}
