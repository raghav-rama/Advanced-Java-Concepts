package com.company;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class SyntheticAnnotaionTest {
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE })
    public @interface Private {}
    @Private
    static String test = "SyntheticAnnotationType";

    public static void main(String[] args) {
        System.out.println(test);
    }
}
