package string;

public class interning {
    public static void main(String[] args) {
        // String s = "dipanshu";
        // String t = "dipanshu"; // both these strings are same onlly one single string not multiple and s and t are pointing towards dipanshu

        String q = new String("dipanshu"); // this q is pointing towards a different string now bcz of new...new string is made and the above 2 dipanshu are same and this dipanshu is different
        System.out.println(q);
    }
}
