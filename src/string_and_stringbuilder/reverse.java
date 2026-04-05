package string_and_stringbuilder;

public class reverse {
    public static StringBuilder reverse_index(StringBuilder s, int i, int j){
       
        while(i<j){
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }
        return s;
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("dipanshu");
    
        System.out.println(reverse_index(s, 0, s.length()-1));


    }
}
