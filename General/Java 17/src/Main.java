import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String s="ab";
        System.out.println(s.substring(0,2));
    }
    private BigInteger digitSum(BigInteger n) {
        BigInteger sum= BigInteger.valueOf(0);
        while(n.compareTo(BigInteger.ZERO)!=0) {
            BigInteger rem = n.remainder(BigInteger.TEN);
            sum = sum.add(rem);
            n = n.divide(BigInteger.TEN);
        }
        return sum;
    }
}