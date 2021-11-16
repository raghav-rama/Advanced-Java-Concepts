package com.playwithinterfacesexample_one;
import com.playwithinterfacesexample_one.InterfaceContainer.Add;

public class Evaluate implements Add {
    @Override
    public int add(int a, int b) {
        System.out.println("eval");
        return a+b;
    }
}
