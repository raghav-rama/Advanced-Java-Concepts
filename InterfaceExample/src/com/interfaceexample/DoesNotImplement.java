package com.interfaceexample;

public class DoesNotImplement {
    private ImplementMe implementMe;
    private Implementing implementing;
    private Implementing_TWO implementing_two;
    DoesNotImplement(ImplementMe implementMe) {
        this.implementMe = implementMe;
        implementing = new Implementing();
//        implementing.implementMe = implementMe;
    }

}
