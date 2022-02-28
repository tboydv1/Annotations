package com.annot;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.NavigableMap;
import java.util.function.*;

public class OuterClass {
     private int i = 999;
     private static String value ="";


    static class A {
        final int me = 1;

        void m1() throws Error{
//            System.out.println(i);
            final var yup = "Me";
            System.out.println(value);
            Float f = 2.0f;

//            NavigableMap m;
//            UnaryOperator u;
            DateTimeFormatter df;
            LocalDate localDate;


        }
    }

//    class B {
//        final String man = "Hey";
//        void m1(){
//            System.out.println(value);
//            System.out.println(i);
//
//        }
//
//        class WhyB{
//
//        }
//    }
//
//


}

 class InitClass{
    public static void main(String args[ ] ){
//        InitClass obj = new InitClass(5);
//        int [] [] array = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4}};
//        var arr1 = array[4];
//        System.out.println (arr1[4]);
//        System.out.println (array[4][1]);

        Supplier supplier;
        Function function;
        Predicate predicate;
        Consumer consumer;

        Path p1 = Paths.get("/photos/goa");
        Path p2 = Paths.get("/index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);




    }
    int m;
    static int i1 = 5;
    static int i2 ;
    int  j = 100;
    int x;
    public InitClass(int m){
        System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
    }
    { j = 30; i2 = 40; }  // Instance Initializer
    static { i1++; }      // Static Initializer
}

interface I{
}

class A implements I{
}

//class B extends A {
//}

class C extends B{
}



