package com.company;

/**
 * <b>{@code JDK verion 17.0.1}</b><br>
* THIS PROJECT IS SORT OF A FORK OF THE FOLLOWING GITHUB REPO<br>
* <a href="https://github.com/root0109/synthetic-concept">Click here to open in browser</a>
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("this project demonstrates how the compiler implements synthetic code in java\n");
        System.out.println("if the code is compiled using java 8, there are more synthetic functions compared to java 17");
        System.out.println("for example in SyntheticGenericClass, access$1 method is not emitted by the java 17 compiler");
        System.out.println("also, in SyntheticInnerClass, only this$0 method is emitted by java 17 compiler compared to" +
                " access$0, access$1 and this$0 by java 8 compiler");
    }
}
