package topcoder;

import java.util.Scanner;

public class BombKingdom {
    int T;
    int N;
    int[][] range_a2b;
    public static void main(String[] args) {
        BombKingdom bk = new BombKingdom();
        bk.process();
    }
    public int minimumBombs() {
        int minimumBombs = N;
        outer:
        for(int i=1;i<N;++i) {
            middle:
            for (int j = range_a2b[i][1]; j <= range_a2b[i][2]; ++j) {
                inner:
                for (int k = range_a2b[i + 1][1]; k <= range_a2b[i + 1][2]; ++k) {
                    if (j == k) {
                        --minimumBombs;
                        continue outer;
                    }
                }
            }
        }
        return minimumBombs;
    }
    public void process() {
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        for(int i=1;i<=T;++i) {
            N=sc.nextInt();
            range_a2b = new int[N+1][3];
            for(int j=1;j<=N;++j) {
                range_a2b[j][1]=sc.nextInt();
                range_a2b[j][2]=sc.nextInt();
            }
            System.out.println(minimumBombs());
        }
    }
}
