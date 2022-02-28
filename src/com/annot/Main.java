package com.annot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class Main {



 static Locale locale = new Locale("fr", "FR");
 static ResourceBundle bundle = ResourceBundle.getBundle("com.annot.MyResources", locale);

     double calculate(double number , Function<Object, Double> function){
         return function.apply( number);
     }

    public static void main(String[] args) throws IOException {

        int i = 0, j = 5;
        lab1 : for( ; ; i++){
                    for( ; ; --j)
                        if( i > j ) break lab1;
        }
        System.out.println(" i = "+i+", j = "+j);


        try(BufferedReader bfr = new BufferedReader(new FileReader("c:\\works\\a.java"))){
            String line = null;
            while( (line = bfr.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException | RuntimeException e){
            e.printStackTrace();
        }

     }


        //      Path p = Path.of("logs/today.txt");
//        Files.createDirectories(p);
//        Path f = Files.createDirectories(p);
//        System.out.println(Files.isRegularFile(f));

//        Path p1 = Path.of("f1.txt");
//        Path p2 = Path.of("f2.txt");
//        Files.writeString(p1, "Hello");
//        Files.writeString(p2, "Goodbye");
//        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXITING);

//        Supplier<Person> supplier = () ->  new Person();
//        System.out.println(supplier.get());
//        Function<Integer, Person> function = (x) ->{
//            if(x == 1){
//                return new Person();
//            }
//            return null;
//        };

        Predicate<Integer> predicate= s -> s > 0;
        Consumer consumer;
        BiFunction biFunction;
    }


//    public static void main(String[] args) throws Exception {
////}
////         List<Integer> integers = List.of(0,1, 2, 3);
//
////         integers.stream()
////                 .peek(i -> {
////                     System.out.println("peek");
////                     if((i % 2 ) != 0) System.out.println(i);
////                 })
////                 .forEach(i ->{
////                     System.out.println("forEach");
////                    if(i % 2 == 0) System.out.println(i);
////                 });
//            List<Object> l = new ArrayList();
//            l.add("String");
//            l.add(0);
//            l.add(new Person("John", 11));
//
//            System.out.println(l.get(2));
//         Locale locale = Locale.getDefault();
//         ResourceBundle people = ResourceBundle.getBundle("com.annot.People", locale);
//         Person john = (Person) people.getObject("john");
//        System.out.println(john.age);


//        Path path = Paths.get("a/b/c/e");
//        Path sub = path.subpath(1, 3);
//        System.out.println(sub);
//
//
//        A a  = new A();
//        A.B1 b1  = new A.B1(); b1.m();
//        A.B2 b2 = new A().new B2();



//        copy("/home/oluwatobi/dev/oracle/labs/report/product101report.txt", "/home/oluwatobi/dev/oracle/labs/data/test2.txt");
//    }
//
//    public static void copy(String records1, String records2) throws IOException {
//        try (
//                InputStream is = new FileInputStream(records1);
//                OutputStream os = new FileOutputStream(records2);) {
//            var buffer = new byte[1024];
//            var bytesRead = 0;
//            while ((bytesRead = is.read(buffer)) != -1) {
//                os.write(buffer, 0, bytesRead);
//            }
//
//        } catch (FileNotFoundException | java.io.InvalidClassException e) {
//            e.printStackTrace();
//        }
//    }
//




//class A {
//    private static String s = "hey";
//
//    static class B1{
//        void m(){
//            s = "bye";
//        }
//    }

//    class B2{
//        void m(){
//            System.out.println(s);
//        }
//    }
//}









