package com.bl;

public class LocalVariable {
    public static void main(String[] args) {
        LocalVariable localVariable  = new LocalVariable();
        localVariable.sum();
        System.out.println("Happy for u..");
    }
    public void sum(){
        int a = 60;
        int b = 40;
        int c = a + b;
        // Access only within an object or constructor...
    }
}
