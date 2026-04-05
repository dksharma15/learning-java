package string_and_stringbuilder;

public class reverse_words {
    public static void reverse_index(StringBuilder s, int i, int j){
        while(i<j){
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("graphic era university");
        int i =0 , j=0;
        while(j<s.length()){
            if(s.charAt(j)!=' ')j++;
            else{
                reverse_index(s, i, j-1);
                i=j+1;
                j=i;
            }
        }
        reverse_index(s, i, j-1); // for last word
        System.out.println(s);
    }
}
