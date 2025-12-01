package pattern;

import java.util.Scanner;

public class abcsqu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=1; i<=x; i++){
            for(char j='A'; j<'A'+x; j++){
              System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
