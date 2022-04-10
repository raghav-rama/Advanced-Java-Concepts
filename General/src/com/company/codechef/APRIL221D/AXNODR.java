package com.company.codechef.APRIL221D;

import java.util.Scanner;

public class AXNODR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int[] C = new int[T];
        for(int i=0; i<T; ++i)
            C[i]=sc.nextInt();
        for(int i=0;i<T;++i) {
            int B=1;
            for(int j=2;j<=C[i];++j)
                B=j%2==0?B^j:B&j;
            System.out.println(B);
        }
    }
}
