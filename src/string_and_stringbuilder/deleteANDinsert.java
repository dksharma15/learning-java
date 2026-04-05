package string_and_stringbuilder;


public class deleteANDinsert {
 public static void main(String[] args) {
    StringBuilder s = new StringBuilder("abcdef");
    System.out.println(s);
    s.deleteCharAt(3);
    System.out.println(s);
    s.insert(1,2);
    System.out.println(s);

 }   
}
