package main;

import java.math.BigDecimal;

public interface Resources {
    String divideByZero = "Can't divide by Zero";
//    char divide = '\u00F7', multiply = '\u00D7', plus = '+', minus = '-';
//    char divide = '/', multiply = '*', plus = '+', minus = '-';
//    int priority_divide = 1, priority_multiply = 2, priority_add = 3, priority_subtract = 4;
    char[] ops = new char[]{' ', '/', '*', '+', '-'};
//    ops[] = {' ', '/', '*', '+', '-'};
    int[] ops_priority = {-1, 1, 2, 3, 4};
//    BigDecimal divide_dummy_value = new BigDecimal("0E999999999999999999");
}
