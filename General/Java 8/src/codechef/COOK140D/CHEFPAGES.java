package codechef.COOK140D;

import java.util.Scanner;

public class CHEFPAGES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        if(a==1 && b==1)
            System.out.println("https://discuss.codechef.com");
        else if(a==1 && b==0)
            System.out.println("https://www.codechef.com/contests");
        else
            System.out.println("https://www.codechef.com/practice");
    }
}
