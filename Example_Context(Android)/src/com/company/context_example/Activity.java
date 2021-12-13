package com.company.context_example;

public class Activity extends ContextWrapper {
    public Activity(Context mContext) {
        super(mContext);
    }
    public void display(){
        System.out.println(getContext());
    }
}
