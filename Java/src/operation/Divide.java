package operation;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collection;

import main.NumberExtractor;
import main.Resources;
import main.SetData;

public class Divide {
    public static String divideByZero;

    public static void divide(int indexOfDivide,SetData data, MathContext mc) {
//        SetData data = new NumberExtractor().numberAndOpsExtractor();
//        System.out.println(data.numbers);
//        System.out.println(data.operations);
//        MathContext mc = new MathContext(9);
        BigDecimal A = data.numbers.get(indexOfDivide);
        BigDecimal B = data.numbers.get(indexOfDivide+1);
        try {
//            return A.divide(B, mc).toString();
//            A = data.numbers.get(indexOfDivide);
//            B = data.numbers.get(indexOfDivide+1);
            BigDecimal C = A.divide(B, mc);
//            Collection C = data.numbers.subList(indexOfDivide,indexOfDivide+1);
            DataRemover.remove(indexOfDivide, data);
//            data.numbers.removeAll(C);
//            data.operations.remove(indexOfDivide);
//            data.numbers.remove(indexOfDivide+1);
//            data.operations.remove(indexOfDivide);
            data.numbers.set(indexOfDivide,C);
//            return c;
        }
        catch(ArithmeticException e){
            System.out.println(Resources.divideByZero);
        }
    }
}
