package com.bl;

public class CheckStatic {
    public static void main(String[] args) {
        System.out.println(StaticVariable.b-StaticVariable.a);
        /* Static variables cannot be access from another class,
           if it is necessary call the variable in another class
                        import that class
                        or call "ThatClassName.required_variable"
           same for method too ClsName.method or import Class.required_method

           Also, static variables or methods can be access from any methods
         */
        StaticVariable.staticFun();
    }
}
