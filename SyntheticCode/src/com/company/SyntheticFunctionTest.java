package com.company;

import java.util.function.Function;

public class SyntheticFunctionTest {
    public static final Function<String, String> returnString = new Function<String, String>() {
        public String apply(String value) {
            return "Synthetic function "+value;
        }
    };
    public static void main(String[] args) {
        System.out.println(returnString.apply("Test"));
    }

}
