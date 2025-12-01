package pattern;

import java.util.Scanner;

public class starplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                if(i==x/2+1 || j==x/2+1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
