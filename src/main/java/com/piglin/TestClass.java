package com.piglin;


class TestClass
{
    public TestClass() {
        System.out.println( "Constructor!" );
    }

    void method() {
        System.out.println( "Method!" );
    }

    static void staticMethod() {
        System.out.println( "Static method!" );
    }

    static {
        System.out.println( "Static code block!" );
    }

    {
        System.out.println( "Code block!" );
    }
}