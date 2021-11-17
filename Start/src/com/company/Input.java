package com.company;

public non-sealed class Input extends Sealed {
    private int START_CODE = 789;
    private int STOP_CODE = 768;

    public void dislay() {
        System.out.println(START_CODE + STOP_CODE);
    }
}
