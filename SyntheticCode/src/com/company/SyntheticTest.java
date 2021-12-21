package com.company;

import java.util.Date;

public class SyntheticTest {

    public static void main(String[] args) {
        SyntheticTest syntheticTest = new SyntheticTest();
        NestedClass nestedClass = syntheticTest.new NestedClass();
        System.out.println(nestedClass.testString);
        System.out.println(nestedClass.getTestString());
        System.out.println(nestedClass.getData());
        System.out.println(nestedClass.getData1());
    }
    /**
     *
     * <h1>Java 17 vs Java 8</h1>
     * <h2>Synthetic code emitted after compilation</h2>
     * If this class is compiled by Java 8, it emits following 4 : <br>{@code final com.company.SyntheticTest this$0}<br>
     * {@code static java.lang.String access$1(com.company.SyntheticTest$NestedClass);}<br>
     * {@code static java.lang.String access$2(com.company.SyntheticTest$NestedClass);}<br>
     * {@code static java.lang.String access$3(com.company.SyntheticTest$NestedClass);}<br>
     * <br> whereas if compiled by Java 17 only {@code this$0} is emitted<br>
     * and less synthetic functions mean more performance vro ;)
      */
    private final class NestedClass {
        private String testString = "Synthetic Nested Class : ";
        private Date testDate = new Date();
        private String getData() {
            return (testString + testDate);
        }
        private String getData1() {
            return (getTestString() + getTestDate());
        }
        public String getTestString() {
            return testString;
        }
        public Date getTestDate() {
            return testDate;
        }
    }
}
