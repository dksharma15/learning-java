package pattern;

import java.util.Scanner;

public class good {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0) System.out.print((char)(64+j));
                else System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
