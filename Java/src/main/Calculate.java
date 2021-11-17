package main;

import operation.Add;
import operation.Divide;
import operation.Multiply;
import operation.Subtract;

import java.math.MathContext;
import java.util.ArrayList;
//import main.SetData;

public class Calculate {
    public void simplify(SetData data) {
        char[] ops = new char[]{' ', '/', '*', '+', '-'};
        MathContext mc = new MathContext(9);
        int[] indexes = new int[(InputStringExpression.originalExpression+" ").length()];
        char[] originalExpressionCharacters = (InputStringExpression.originalExpression+" ").toCharArray();
//        boolean do_divide_multiply = (data.operations.contains(ops[1]) || data.operations.contains(ops[2])),
//                do_addition_subtraction = (data.operations.contains(ops[3]) || data.operations.contains(ops[4]));
        boolean do_divide_multiply = true,
                do_addition_subtraction = true;
        int counter = 0;
        for(int i=0; i<indexes.length; ++i)
            indexes[i] = i;
//        ArrayList<Character> arrayList = data.operations;
            int length = data.operations.size();
            System.out.println(length);
            while(do_divide_multiply) {
//                int index = data.operations.indexOf(ops[i]);
                char c = data.operations.get(counter);
                if (c == ops[1]) {
                    Divide.divide(counter, data, mc);
                    System.out.println(1);
                    do_divide_multiply = (data.operations.contains(ops[1]) || data.operations.contains(ops[2]));
                    continue;
                } else if (c == ops[2]) {
                    Multiply.multiply(counter, data, mc);
                    System.out.println(2);
                    do_divide_multiply = (data.operations.contains(ops[1]) || data.operations.contains(ops[2]));
                    continue;
                }
                System.out.println(data.operations);
                System.out.println(data.numbers);
                ++counter;
            }
            counter = 0;
            while(do_addition_subtraction) {
                char c = data.operations.get(counter);
                if(c == ops[3]){
                    Add.add(counter, data, mc);
                    System.out.println(3);
                    do_addition_subtraction = (data.operations.contains(ops[3]) || data.operations.contains(ops[4]));
                continue;}
                else if(c == ops[4]){
                    Subtract.subtract(counter, data, mc);
                    System.out.println(4);
                    do_addition_subtraction = (data.operations.contains(ops[3]) || data.operations.contains(ops[4]));
                continue;}
                System.out.println(data.operations);
                System.out.println(data.numbers);
                ++counter;
            }
            System.out.println(data.operations);
            System.out.println(data.numbers);
        }


}
//894/789*646+5648-78*98/7895*983
//25*36/65-96+698/329-63*32+9
