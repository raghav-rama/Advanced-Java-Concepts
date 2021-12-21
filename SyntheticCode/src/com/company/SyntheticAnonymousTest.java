package com.company;
/*
This class will produce one class of Synthetic code namely 'SyntheticAnonymousTest$1.class'
 */

public class SyntheticAnonymousTest {
    interface Callback<T> {
        String call(T value);
    }

    public static void main(String... args) {
        System.out.println(new Callback<String>() {
            @Override
            public String call(String value) {
                return ("Synthetic anonymous "+value);
            }
        }.call("Test"));
    }
}
