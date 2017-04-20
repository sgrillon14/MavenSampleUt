package com.github.sgrillon14.sampleut;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        int a = 0;
        if (args == null) {
            a = a + 3;
        } else {
            a = a + 4;
        }
        System.out.println("Hello World!" + a);
    }

}
