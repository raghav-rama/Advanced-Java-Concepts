package test;

import java.math.BigDecimal;
import java.util.Scanner;
import java.math.MathContext;
public class C {
  public static void main(String args[]) {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    BigDecimal A = new BigDecimal(sc.next());
    BigDecimal B = A.multiply(new BigDecimal("2.2046226218488"));
    int precision = B.toString().indexOf('.') + 2;
    if(precision>14) precision = 14;
    MathContext mc = new MathContext(precision);
    System.out.println(B.round(mc));
    // if(B.compareTo("1"))
    // BigDecimal C = B.round(mc);
    // System.out.println(B.compareTo(BigDecimal.ONE));
    // System.out.println(B.round(mc).precision());
    // System.out.println(C.precision());
    // System.out.println(B.round(mc).equals(BigDecimal.ZERO));
    // System.out.println(B.round(mc));
    String s = B.round(mc).toString();
    int indexOfDot = s.indexOf('E');
    if(!(indexOfDot==-1) && !(s.charAt(0)=='0')) {
      System.out.println(s);
      String num = s.substring(0,indexOfDot) + " x " + "10^" + s.substring(indexOfDot+1);
      System.out.println(num);
    }
    else if(s.charAt(0)=='0') {
      System.out.println(0);
    }
    else {
      System.out.println(s);
    }
  }
}
//892374234523642345345268374563248654
// 89237423452364226560
// 196734842458580647936
// 999999999999999
