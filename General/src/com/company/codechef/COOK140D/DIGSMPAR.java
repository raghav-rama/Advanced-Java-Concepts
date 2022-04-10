package com.company.codechef.COOK140D;

import java.util.Scanner;

public class DIGSMPAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] num = new int[T];
        for(int i=0; i<T; ++i)
            num[i] = sc.nextInt();
        for(int i=0; i<T; ++i) {
            for(int j=1; ;++j) {
                if(isEven(sumDigit(num[i])) != isEven(sumDigit(num[i]+j))) {
                    System.out.println(num[i]+j);
                    break;
                }
            }
        }
    }
    static int sumDigit(int num) {
        if(num!=0)
            return num%10 + sumDigit(num/10);
        else
            return 0;
    }
    static boolean isEven(int n) {
        return n%2==0;
    }
}
