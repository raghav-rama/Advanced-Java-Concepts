package com.company.codechef.APRIL221D;

import java.util.Scanner;

public class NOTUNIT {
    @Deprecated
    static int oldFindGCD(int a, int b) {
        if (a == 0 | b == 0)
            return 0;
        else if(a == 1 | b == 1)
            return 1;
        else if (a == b)
            return a;
        else if (a > b)
            return findGCD(a - b, b);
        else if (a < b)
            return findGCD(a, b - a);
        return -1;
    }

    static int findGCD(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] X = new int[T][2];
        for(int i=0; i<T; ++i) {
            X[i][0]=sc.nextInt();
            X[i][1]=sc.nextInt();
        }
        outer:
        for(int i=0; i<T; ++i) {
            for (int j = X[i][0], c = 0; j <= X[i][1]; ++j, ++c) {
                for (int k = 1; k <= X[i][1] - X[i][0] - c; ++k) {
                    if (oldFindGCD(j, j + k) != 1) {
                        System.out.println(j + " " + (j + k));
                        continue outer;
                    }
                }
            }
            System.out.println(-1);
        }
    }
}
