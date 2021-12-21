package com.company;

public class SyntheticLambdaTest {
    interface Callback<T> {
        String call(T value);
    }
    public static void main(String[] args) {
        System.out.println(((Callback<String>) value -> "Synthetic Lambda " + value).call("Test"));
    }
}
