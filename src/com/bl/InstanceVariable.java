package com.bl;

public class InstanceVariable {

    int a = 10;
    int b = 40;

    public static void main(String[] args) {
//      int c = a + b;
        InstanceVariable instance = new InstanceVariable();
        instance.instance();
    }

    /*  Instance variable can be accessed inside an instance method but can't access inside static method.
        If want to use it in static method then, make the variable static.
        Instance method can also access with in an instance method but to access within a static method
        by creating object reference. And call the required method.
     */
    public void instance(){
        int c = a + b;
        instance1(c);
    }
    public void instance1(int c) {
        System.out.println("Sum is " + c);
    }
}
