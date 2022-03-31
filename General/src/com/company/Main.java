package com.company;

public class Main {

    public static void main(String[] args) {
	StringBuilder str = new StringBuilder();
    char a = 'a';
    str.append(a);
    str.append(++a);
    str.append(Main.ascii(a+4));
    System.out.println(str);
    }
    public static char ascii(int n) {
        return (char)n;
    }
}