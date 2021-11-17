package main;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CalculatorStringParser {
    public static void main(String args[]) {
        InputStringExpression.input();
//        InputStringExpression.originalExpression = "7/7";
        SetData data = new SetData(new ArrayList<Character>(), new ArrayList<BigDecimal>());
        NumberExtractor number_extractor = new NumberExtractor();
        number_extractor.numberAndOpsExtractor(data);
        data.displayData();
        data.doOperation();
        data.displayData();
//        main.InputStringExpression.originalExpression = main.InputStringExpression.input();
//        NumberExtractor obj1 = new NumberExtractor();
//        SetData obj = obj1.numberAndOpsExtractor();
//        obj.displayData();
//        obj.doOperation();
//        obj.displayData();
//        System.out.println(obj1.divide);
//        System.out.println("\u1F92F");
//        obj.doOperation(obj);
//        obj.displayData(obj);
    }
}
