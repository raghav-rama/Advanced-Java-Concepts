package com.company.codechef.APRIL221D;

import java.math.BigInteger;
import java.util.Scanner;

public class AXNODR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        long[] C = new long[T];
        for(int i=0; i<T; ++i)
            C[i] = sc.nextLong();
        for(int i=0;i<T;++i) {
            if( (C[i]-1) % 4 == 0 )
                System.out.println(C[i]);
            else if( C[i] % 4 == 0 )
                System.out.println(C[i]+3);
            else
                System.out.println(3);
        }
    }
}
