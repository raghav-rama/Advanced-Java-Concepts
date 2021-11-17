package test;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.MathContext;
public class B {
  public static void main(String args[]) {
    ArrayList<BigDecimal> arraylist = new ArrayList<>();
    BigDecimal A = new BigDecimal("293840.234029");
    BigDecimal B = new BigDecimal("3434.43568029");
    BigDecimal C = new BigDecimal("34563.8789");
    BigDecimal D = new BigDecimal("3456.56445");
    BigDecimal E = new BigDecimal("9898.98765");
    BigDecimal F = new BigDecimal("9092145.878");
    BigDecimal G = new BigDecimal("8756.9765435678");
    BigDecimal H = new BigDecimal("8784356778654.98");
    arraylist.add(A.multiply(B));
    // arraylist.add(C.divide(H).round(new MathContext(6)));
    arraylist.add(D.multiply(C));
    arraylist.add(A);
    arraylist.add(B);
    arraylist.add(B);
    arraylist.add(C);
    arraylist.add(D);
    arraylist.add(E);
    arraylist.add(G);
    arraylist.add(F);
    arraylist.add(H);
    arraylist.add(D);
    arraylist.add(A);
    // System.out.println(arraylist);
    MathContext mc = new MathContext(4);
    BigDecimal a = new BigDecimal("11");
    BigDecimal b = new BigDecimal("3");
    BigDecimal c = a.divide(b,mc);
    System.out.println(c);
  }
}
