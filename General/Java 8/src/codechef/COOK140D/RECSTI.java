package codechef.COOK140D;


import java.util.*;

public class RECSTI {
    private static final ArrayList<ArrayList<Integer>> num = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    private static int min;

    public static void main(String[] args) {
        int T = sc.nextInt();
        int j=0;
        int[] a={2,3,4,5,9,1,5,2,0,9,4,5,6,3};
        int[] b=new int[a.length-(8-4+1)];
//        reduceArraySize(a, b,8,4);
        for(int i=1; i<=T; ++i) {
            num.add(new ArrayList<>());
            input(num, sc.nextInt(), j++);
        }
    }
    static void input(ArrayList<ArrayList<Integer>> num, int n, int j) {
        for(int i=0; i<n; ++i)
            num.get(j).add(sc.nextInt());
    }
//    static void solve() {
//        int r=0,c=0,rect=0;
//        ArrayList<Integer> current = num.get(r);
//        int n=current.size();
//        Collections.sort(current);
//        int currentNum = current.get(c);
//        for(int i=0; i<n; ++i) {
//            int nextBiggestNum = nextBigger(current.get(i), current.get(i+1), current);
//            if(currentNum==nextNum & rect==2) {
//                ++i;
//            }
//            else if(currentNum!=nextNum & rect==2) {
//                ++i;
//                ++min;
//            }
//        }
//    }
    static int nextBigger(int currentNum, int nextBiggestNum, ArrayList<Integer> current) {
        for(int num : current)
            if(num < nextBiggestNum & num > currentNum)
                nextBiggestNum = num;
        return nextBiggestNum;
    }
    static <T> T[] reduceArraySize(T[] array, T[] newArray, int start, int end) {
        System.arraycopy(array, 0, newArray,0,start);
        System.arraycopy(array, end+1, newArray,start+1,array.length-end-1);
        array=null;
        return newArray;
    }
}
