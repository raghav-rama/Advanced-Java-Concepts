package com.company.codechef.COOK140D;

import java.util.Scanner;

public class FUNHAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int[] A = new int[T];
        int[] B = new int[T];
        int[] N = new int[T];
        for(int i=0; i<T; ++i) {
            N[i] = sc.nextInt();
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        for(int i=0; i<T; ++i) {
            int max = Math.max(A[i], B[i]);
            int min = Math.min(A[i], B[i]);
            if(max-min == 1) {
                if(N[i]==2)
                    System.out.println(0);
                else if(max <= N[i]-1 & min >= 2)
                    System.out.println(2);
                else if(max <= N[i]-1 & min == 1)
                    System.out.println(1);
                else if(max == N[i])
                    System.out.println(1);
            }
            else
                System.out.println(0);
        }
    }
}
