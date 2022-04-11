package com.company.codechef.APRIL221D;

import java.math.BigInteger;
import java.util.Scanner;

public class AXNODR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
//        int[] C = new int[T];
        BigInteger[] C = new BigInteger[T];
        for(int i=0; i<T; ++i)
            C[i]=new BigInteger(sc.next());
        for(int i=0;i<T;++i) {
            BigInteger B = BigInteger.ONE;
            for(BigInteger j=BigInteger.TWO;j.compareTo(C[i])<=0;j=j.add(BigInteger.ONE))
//                B=j%2==0?B^j:B&j;
                B=j.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0 ? B.xor(j) : B.and(j);
            System.out.println(B);
        }
    }
}
