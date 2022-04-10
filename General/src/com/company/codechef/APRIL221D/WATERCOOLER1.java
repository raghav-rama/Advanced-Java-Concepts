package com.company.codechef.APRIL221D;

import java.util.Scanner;

public class WATERCOOLER1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] X = new int[T][3];
        for (int i = 0; i < T; ++i) {
            X[i][0] = sc.nextInt();
            X[i][1] = sc.nextInt();
            X[i][2] = sc.nextInt();
        }
        for (int i = 0; i < T; ++i) {
            if(X[i][0]*X[i][2] < X[i][1])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
