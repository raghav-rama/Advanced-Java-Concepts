package newtonschool.gcgmarch2022;

import java.math.BigInteger;
import java.util.Scanner;

public class XorZero {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        String s=sc.next();
        int N=0,T=0;
        char[] rounds = s.toCharArray();
        for(char c : rounds) {
            if(c=='N') ++N;
            else ++T;
        }
        if(N<T)
            System.out.println("Tusla");
        else
            System.out.println("Nutan");
    }
}
