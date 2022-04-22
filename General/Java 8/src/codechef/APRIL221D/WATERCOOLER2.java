package codechef.APRIL221D;

import java.util.Scanner;

public class WATERCOOLER2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] X = new int[T][2];
        for(int i = 0; i < T; ++i) {
            X[i][0] = sc.nextInt();
            X[i][1] = sc.nextInt();
        }
        for(int i = 0; i < T; ++i) {
            if(X[i][1] % X[i][0] != 0) {
                System.out.println(X[i][1] / X[i][0]);
            }
            else {
                System.out.println(X[i][1] / X[i][0] - 1);
            }
        }
    }
}
