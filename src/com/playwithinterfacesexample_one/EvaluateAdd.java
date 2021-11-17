package com.playwithinterfacesexample_one;
import com.playwithinterfacesexample_one.InterfaceContainer.Add;

public class EvaluateAdd {
    public void display(Add add) {
        System.out.println("eval_add");
        System.out.println(add.add(5,6));
        /*
        Above add is an instance of the anonymous class, hence add(a, b) of anon class will be called
         */
    }
}
