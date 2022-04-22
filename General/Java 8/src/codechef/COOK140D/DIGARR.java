package codechef.COOK140D;

import java.util.Scanner;

public class DIGARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
//        int[] N = new int[T];
        String[] D = new String[T];
        for(int i=0; i<T;++i) {
            int N = sc.nextInt();
            D[i] = sc.next();
        }
        for(int i=0; i<T;++i) {
            if(D[i].equals("0")) {
                System.out.println("NO");
            } else if(!D[i].contains("0") & !D[i].contains("5")) {
                System.out.println("NO");
            } else if(D[i].contains("0") | D[i].contains("5")) {
                System.out.println("YES");
            }
        }
    }
}
