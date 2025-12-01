package pattern;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=x; i>=1; i--){
            for(int j=1; j<=x; j++){
              System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
