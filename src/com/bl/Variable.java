package com.bl;

public class Variable {

    /*  These are "Instance" variable which has access with in the class'
     */
    int x;
    int y;
    // These are "Static" variable which can be accessed anywhere with in the package
    static int m;
    static int n;

    public static void main(String[] args) {
        // These are "Local" variable have scope only under the method or constructor.
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum is " +c);
    }
}
