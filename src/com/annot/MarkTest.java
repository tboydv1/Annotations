package com.annot;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MarkTest {



    public static void main(String[] args) {
//        try(Reader r = new BufferedReader(new FileReader("test.txt"))){
//            if(r.markSupported()){
//                BufferedReader in = (BufferedReader) r;
//                System.out.println(in.readLine());
//                System.out.println(in.readLine());
//                in.mark(100);
//                System.out.println(in.readLine());
//                in.reset();
//                System.out.println(in.readLine());
//                in.reset();
//                System.out.println(in.readLine());
//            }
//            else{
//                System.out.println("Mark not Supoorted");
//            }

//        } catch (IOException e) {
//            e.printStackTrace();
//        }


     }
}
//
//class Student {
//
//    public static enum Grade{ A, B , C, D, F}
//
//    private String name;
//    private Grade grade;
//    public Student(String name, Grade grade){
//        this.name = name;
//        this.grade = grade;
//    }
//    public String toString(){
//        return name+":"+grade;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Grade getGrade() {
//        return grade;
//    }
//
//    public void setGrade(Grade grade) {
//        this.grade = grade;
//    }
//
//    public static void main(String[] args) {
//        //What can be inserted in the code below so that it will print:
//        //{C=[S3], A=[S1, S2]}
//
//
//        List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A), new Student("S2", Student.Grade.A), new Student("S3", Student.Grade.C));
//        Map<Grade, List<Student>> result1 = ls.stream().collect(Collectors.groupingBy(Student::getGrade));
//
//        Map<Grade, List<String>> result = ls.stream().collect(Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));
////        Map<Grade, List<String>> result2 = ls.stream().collect(Collectors.groupingBy(Student::getGrade, Collectors.groupingBy(Student::getName, Collectors.toList())));
//
//        System.out.println(result);
//
//
//    }
//}

interface Boiler{
    public void boil();
    private static void log(String msg){ //1
        System.out.println(msg);
    }
    public static void shutdown(){
        log("shutting down");
    }
}
interface Vaporizer extends Boiler{
    public default void vaporize(){
        boil();
        System.out.println("Vaporized!");
    }
}

public class Reactor implements Vaporizer{
    public void boil() {
        System.out.println("Boiling...");
    }

    public static void main(String[] args) {
        Vaporizer v =  new Reactor(); //2
        v.vaporize(); //3
        v.shutdown(); //4
    }
}



