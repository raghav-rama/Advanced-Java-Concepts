package newtonschool.gcgmarch2022;

import java.util.Scanner;

public class SmallestString {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        StringBuilder str = new StringBuilder();
        char a = 'a';
        int count=2,i;
        T=sc.nextInt();
        int t=T;
        int[] N = new int[T];
        int[] K = new int[T];
        for(i=0;i<T;++i) {
            N[i] = sc.nextInt();
            K[i] = sc.nextInt();
        }
        i=0;
        while(t-- > 0) {
            if(N[i]<K[i] | K[i]==1) {
                if(N[i]==1 && K[i]==1) {
                    System.out.println(a);
                } else {
                    System.out.println("-1");
                }
                ++i;
                continue;
            } else {
                for(int j=1;j<=N[i];++j) {
                    if(j <= (N[i]-(K[i]-2)) ) {
                        if(j%2==0)
                            str.append((char)(a+1));
                        else
                            str.append(a);
                    }
                    else
                        str.append((char)(a+count++));
                }
            }
            System.out.println(str);
            ++i;
            count=2;
            str.setLength(0);
        }
    }
}
