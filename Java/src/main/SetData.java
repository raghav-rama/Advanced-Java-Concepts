package main;

import operation.Divide;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collection;

public class SetData {
    public ArrayList<Character> operations = new ArrayList<>();
    public ArrayList<BigDecimal> numbers = new ArrayList<>();
    SetData() {
        this.operations = null;
        this.numbers = null;
    }
    public SetData(ArrayList<Character> operations, ArrayList<BigDecimal> numbers) {
        this.operations = operations;
        this.numbers = numbers;
    }
     public void displayData(/*SetData data*/) {
//         System.out.println(data.operations);
//         System.out.println(data.numbers);
//         System.out.println(data.numbers.size());
         System.out.println(operations);
         System.out.println(numbers);
         System.out.println(numbers.size());
//         System.out.println(data.numbers.get(3));
//         System.out.println(data.numbers.get(2));
//         System.out.println(data.numbers.get(5));
//         System.out.println(data.numbers.get(0));
     }
    public void doOperation() {
        Calculate calculate = new Calculate();
        calculate.simplify(this);
    }
}
//    public void doOperation() {
//        int indexOfDivide = operations.indexOf(Resources.divide);
//        int indexOfMultiply = operations.indexOf(Resources.multiply);
//        int indexOfAdd = operations.indexOf(Resources.plus);
//        int indexOfSubtract = operations.indexOf(Resources.minus);

//        MathContext mc = new MathContext(9);

//        String expression = InputStringExpression.originalExpression;
//        char c = expression.charAt(1);

//        if(data.operations.get(0) == Resources.divide){ operation.Divide.divide(0, data, mc);
//            System.out.println("div");}
//        else if(data.operations.get(0) == Resources.multiply) operation.Multiply.multiply(0, data, mc);

//        if (operations.get(0) == Resources.ops[1]) {
//            operation.Divide.divide(0,this,  mc);
//            System.out.println("div");
//        }
//         else if(operations.get(0) == Resources.multiply) operation.Multiply.multiply(0, mc);

//        MathContext mc = new MathContext(9);
//        BigDecimal A = data.numbers.get(indexOfDivide);
//        BigDecimal B = data.numbers.get(indexOfDivide+1);
//        try {
//            BigDecimal c = A.divide(B, mc);
//            Collection C = data.numbers.subList(indexOfDivide,indexOfDivide+1);
//            data.numbers.removeAll(C);
//            data.numbers.set(indexOfDivide,c);
//            data.operations.remove(indexOfDivide);
//            Divide.divide(indexOfDivide, data);
//        }
//        catch(ArithmeticException e) {
//            System.out.println("Can't divide by Zero");
//        }
//         return data;
//    }