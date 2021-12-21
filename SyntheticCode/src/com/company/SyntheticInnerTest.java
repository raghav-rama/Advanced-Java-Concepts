package com.company;

public class SyntheticInnerTest {
    public static void main(String[] args) {
        SyntheticInnerTest syntheticTest = new SyntheticInnerTest();
    }
    private static String displayText(String test) {
        return test;
    }
    private final class NestedClass {
        private final String testString = "Synthetic Nested String : ";
        private String getResult() {
            return SyntheticInnerTest.displayText(testString);
        }
    }
}
