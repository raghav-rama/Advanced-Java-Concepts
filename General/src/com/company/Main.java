package com.company;

public class Main {

    public static void main(String[] args) {
	String s="tmkc";
    char arr[] = s.toCharArray();
    arr[0]='4';
    s=String.valueOf(arr);
    System.out.println(s);
    }
}
