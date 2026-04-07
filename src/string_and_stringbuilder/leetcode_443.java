package string_and_stringbuilder;

public class leetcode_443 {
 public static void main(String[] args) {
    String s = "aaabbbbcdaa";
    char[] arr = s.toCharArray();
    String ans = "";
    int i = 0, j=0;
    while(j<arr.length){
        if(arr[i]==arr[j]) j++;
        else{
            ans += arr[i];
            int count = j-i;
            if(count!=1) ans += count;
            i=j;
        }
        
    }
    ans += arr[i];
    int count = j-i;
    if(count!=1) ans += count;
    System.out.println(ans);
    System.out.println(ans.length());
}   
}
