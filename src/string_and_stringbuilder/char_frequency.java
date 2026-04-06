package string_and_stringbuilder;


public class char_frequency {
    public static void main(String[] args) {
        String s = "aabacdefabcd";
        int[] frequency = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int ascii = (int)ch-97; // -97 so that index becomes 0 to 25
            frequency[ascii] ++;
        }
        int max = -1;
        for(int ele : frequency){
            max = Math.max(max, ele);
        }

        for(int i=0; i<26; i++){
            if(frequency[i]==max){
                char ch = (char)(i+97);
                System.out.println(ch);
            }
        }

    }
}
