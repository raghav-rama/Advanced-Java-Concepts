package com.company.context_example;

public class Main {

    public static void main(String... args) {
        Activity activity = new Activity(new Context() {
            @Override
            public Context getContext() {
                return null;
            }
        });
        activity.display();
    }
}
