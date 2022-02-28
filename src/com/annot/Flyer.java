package com.annot;

import java.io.FileNotFoundException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

import static java.lang.annotation.ElementType.TYPE_PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

abstract class Flyer{ abstract String getName(); }

class Bird extends Flyer{
    public String name;
    public Bird(String name){
        this.name = name;
    }
    @Override
    public String getName(){ return name; }
}

class Eagle extends Bird {
    public Eagle(String name){
        super(name);
    }
}

class TestClass {

//    public static void main(String[] args) throws Exception {
//
//        int i, j, k;
//        i = j = k = 9;
//        System.out.println(i);
//
//        Flyer f = new Eagle("American Bald Eagle");
//        //PRINT NAME HERE
//        System.out.println(f.getName());
//        System.out.println(((Bird) f).name);
//        System.out.println(((Eagle) f).name);
//    }

    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(java.io.FileNotFoundException s) {
        System.out.println("java.io.FileNotFoundException Version");
    }

    public void method(java.io.IOException s) {
        System.out.println("IOException Version");
    }

    public static void main(String args[]) {
        List<Double> dList = Arrays.asList(10.0, 12.0);
        dList.forEach(x->{ x = x + 10; });
        dList.forEach(System.out::println);
        List<String> listOfWords = Arrays.asList("ye", "me");
//        Arrays.asList().parallelStream().collect(va);

        var list2 = new ArrayList<String>();
        listOfWords.parallelStream().forEach(s->{ if(s.length()==2) {
            synchronized(list2) {
                list2.add(s);
            }
        }
        } );

        System.out.println(list2);

        ExecutorService ec = Executors.newSingleThreadExecutor();


    }

}





//abstract class AmazingClass{
//    void amazingMethod(Collection c){
//        System.out.println("Got collection");
//    };
//}

//@Retention(value=RUNTIME)
//@Target(value={TYPE_USE,TYPE_PARAMETER})
//@interface NonNull{
//}


// class SpecialAmazingClass extends AmazingClass{
//
//    void amazingMethod(List l){
//        System.out.println("Got list");
//
//    };

//    public static void main(String[] args) throws Exception {
//        List<String> al = new ArrayList<String>();
//        Collection<String> c = al;
//        AmazingClass ac = new SpecialAmazingClass();
//        ac.amazingMethod(c);
//        ac.amazingMethod(al);
//
//        Function<?,?> result = ( @NonNull Integer  x ) -> Integer.toHexString(x);
////            @NonNull var y;
//        @NonNull String st;
////        var a, b, c;
//        int a=100, b, d;
//        a = b = d = 100;
//        float foo =2, bar = 2, baz =4;
//        float mod = foo % baz, mod2 = baz % foo;
//        float val = mod>mod2 ? bar : baz;
//        System.out.println(val);
//
////        yourMethod();
//
//        int[] arr = new int[0];
//        System.out.println(arr != null);
//
//         Path p1 = Paths.get("c:/finance/data/reports/daily/pnl.txt");
//
//            System.out.println(p1.subpath(0, 2));

//        DateTimeFormatter dt = DateTimeFormatter.ofPattern("M");
//
//        System.out.println(dt.format(LocalDate.of(2014, 8, 24)));

//        String[][][] arr  =         {
//                                        {
//                                            { "a", "b" , "c"}, { "d", "e", null }
//                                        },
//                                        {
//                                            {"x"}, null
//                                        },
//                                        {
//                                            {"y"}
//                                        },
//                                        {
//                                            { "z","p"}, {null}
//                                        }
//                                    };
//
////        System.out.println(arr[1][0][0]);
//
//
//
//        String[][] arr2 = {{}, null};
//
//        String[][][] arr3 = {{null}, {{"3", "4", null}, {null} }};
//
////        System.out.println(Integer.parseInt("100", 2));
//        var ca = new char[]{'a', 'b', 'c', 'd'};
//        var i = 0;
//        for(var c : ca){
//            switch(c){
//                case 'a' : i++;
//                case 'b' : ++i;
//                case 'c'|'d' : i++;
//            }
//        }
//        System.out.println("i = "+i);
//
//    }
//
//}


//     public static void yourMethod() throws Exception {
//         throw new Exception();
//     }

     abstract class B {
//         @Override
         String getV() { return ""; }
     }

     interface I1{
         void setValue(String s);
         String getV();
     }


     interface T1{
     }
     interface T2{
         int VALUE = 10;
         void m1();
     }

     interface T3 extends T1, T2{
          void m1();
          void m1(int x);
     }
