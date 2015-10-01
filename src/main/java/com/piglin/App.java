package com.piglin;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{

    void method() {
        System.out.println( "MAIN Method!" );
    }

    static void staticMethod() {
        System.out.println( "MAIN Static method!" );
    }

    static {
        System.out.println( "MAIN Static code block!" );
    }

    {
        System.out.println( "MAIN Code block!" );
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TestClass instance = new TestClass();
        instance.method();
        instance.staticMethod();
        staticMethod();
        System.out.println( "Hello World!" );
        TestClass instance2 = new TestClass();
        instance2.method();
        instance2.staticMethod();
        staticMethod();

        int i;

        i = 0xfffffffa;
        System.out.println(i+" -6");

        i = 0b0010;
        System.out.println(i+" 2");

        i = 0b0010 << 1;
        System.out.println(i+" 4");

        i = 0b0010 >> 1;
        System.out.println(i+" 1");

        i = 0b0010 >>> 1;
        System.out.println(i+" 1");

        i = 0b0010 >> 2;
        System.out.println(i+" 0");

        i = 0b0010 << 2;
        System.out.println(i+" 8");

        i = 0b0010 >>> 2;
        System.out.println(i+" 0");

        i = 0b0010 >> 4;
        System.out.println(i+" 0");

        i = 0b0010 << 4;
        System.out.println(i+" 32");

        i = 0b0010 >>> 4;
        System.out.println(i+" 0");

        i = 0b11110010;
        System.out.println(i+" 242");

        byte b;

        b = 0b0010 >>> 2;
        System.out.println(b+" ");

        Date date1 = new Date();
        Date date2 = new Date();
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date2-date1);
    }


}


