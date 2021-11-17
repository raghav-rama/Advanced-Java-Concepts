package operation;

import main.SetData;

import java.math.BigDecimal;
import java.math.MathContext;

public class Add {
    public static void add(int indexOfAdd,SetData data, MathContext mc) {
        BigDecimal A = data.numbers.get(indexOfAdd);
        BigDecimal B = data.numbers.get(indexOfAdd+1);
        BigDecimal C = A.add(B, mc);
        DataRemover.remove(indexOfAdd, data);
        data.numbers.set(indexOfAdd, C);
    }
//    public static BigDecimal add(SetData data, MathContext mc) {
//        MathContext mc = new MathContext(9);
//        return A.add(B, mc);
//    }
}
