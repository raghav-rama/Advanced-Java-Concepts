package com.playwithinterfacesexample_one;

public class Main {

    public static void main(String... args) {
    Evaluate eval = new Evaluate();
    Integer a = new Integer(5);
    EvaluateAdd eval_add = new EvaluateAdd();
    eval_add.display(new InterfaceContainer.Add() {
        @Override
        public int add(int a, int b) {
            System.out.println("Anon class");
            return a+b;;
        }
    });
    eval.add(3,4);
    }
}
