package pattern;

import java.util.Scanner;

public class alphasqsame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        // for(int i =1; i<=x; i++){
        //     for(int j=1; j<=x; j++){
        //         System.out.print((char)(i+64)+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                System.out.print((char)('A'+i-1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
