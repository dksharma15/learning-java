package pattern;

import java.util.Scanner;

public class starcross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =1 ; i<=x; i++){
            for(int j=1; j<=x; j++){
                if(i==j) System.out.print("* ");
                else if(i+j==x+1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
