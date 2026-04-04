package string_and_stringbuilder;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");
        System.out.println(sb);
        System.out.println(sb.capacity()); // by default capacity is 16 that is why 16 + 4 = 20
        System.out.println(sb.length());
        System.out.println(sb.reverse());

        // function setCharAt();
        sb.setCharAt(3, 'z');
        System.out.println(sb);
    }
}
