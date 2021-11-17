package main;

import java.math.BigDecimal;
import java.util.ArrayList;
// 87/94+65-51*644
public class NumberExtractor {
    private boolean div_mul = false, special = false;
//    private StringBuilder temp;
//    private StringBuilder original_temp;
//    private main.SetData data;

//    main.NumberExtractor() {
//
//        original_temp = new StringBuilder("");
//        data = new main.SetData(new ArrayList<Character>(), new ArrayList<BigDecimal>());
//    }
//    main.NumberExtractor(String expression) {
//        temp = new StringBuilder("");
//        data = new main.SetData(new ArrayList<Character>(), new ArrayList<BigDecimal>());
//        original_temp = new StringBuilder(expression);
//    }

    //    public char divide = '\u00F7', multiply = '\u00D7', plus = '+', minus = '-';
    public SetData numberAndOpsExtractor(SetData data) {
        StringBuilder temp = new StringBuilder("");
//        SetData data = new SetData(new ArrayList<Character>(), new ArrayList<BigDecimal>());
        char[] originalExpressionCharacters = (InputStringExpression.originalExpression+" ").toCharArray();
        int length = originalExpressionCharacters.length;
        boolean isNotEqualTo = true, isDigit = true;
//        char[] ops = Resources.ops;
        char[] ops = new char[]{' ', '/', '*', '+', '-'};
//        System.out.println(Resources.divideByZero);
        for (char c : originalExpressionCharacters) {
            isDigit = Character.isDigit(c);
            if(c == ops[1] || c == ops[2])
                div_mul = true;
            else if(div_mul && c == ops[4]) {
                div_mul=false;
                special=true;
                continue;
            }
            else
                div_mul=false;
            if (!isDigit) {
//                System.out.println(special);
//                System.out.println(c);
//                System.out.println(c==main.Resources.minus);
//                System.out.println(c=='-');
                addToList(temp, data, special);
////                System.out.println(temp);
//                BigDecimal number = new BigDecimal(temp.toString());
//                data.numbers.add(number);
                data.operations.add(c);
//                temp.setLength(0);
//                isDigit=false;
            }
            if (isDigit) {
//                System.out.println(temp);
                temp.append(c);
//                System.out.println(temp.indexOf(String.valueOf(c))+" "+(original_temp.length() - 1));
//                original_temp.deleteCharAt(0);
            }
//                if(temp.indexOf(String.valueOf(c)) == original_temp.length() - 1) {
////                System.out.println(main.InputStringExpression.originalExpression.indexOf(c)+""+(originalExpressionCharacters.length - 1));
//                System.out.println("hell");
//                addToList(temp, data/*,c*/);
//            }
        }
        return data;
    }
    private void addToList(StringBuilder temp, SetData data/*, char c*/, boolean special) {
        BigDecimal number;
        if(special) {
            number = new BigDecimal(("-" + temp.toString()));
            this.special = false;
        }
        else
            number = new BigDecimal(temp.toString());
        data.numbers.add(number);
//        original_temp.deleteCharAt(0);
//        data.operations.add(c);
        temp.setLength(0);
    }
}
