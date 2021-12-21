package com.company;

import java.util.function.Supplier;

public class SyntheticMethodReferenceTest {
    private static class Greeter {
        public static String sayHi() {
            return "Synthetic Hi!";
        }
    }
    public static void main(String args[]) {
        Supplier<String> supplier = Greeter::sayHi;
        System.out.println(supplier.get());
    }
}
