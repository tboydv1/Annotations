package com.annot;


import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.METHOD})
//@Target(ElementType.TYPE)
 @interface MyAnno {
    String str() default "";
    int val();
//    String[][] params();//6
//    java.util.Date entryTime();//7
}

@Retention(RetentionPolicy.RUNTIME)
 @interface What{
    String description();
}

@MyAnno(str = "Meta2", val = 99)
@What(description = "An annotation test class")
class Meta2 {
    //Annotate a method
    @MyAnno(str = "Annotation Example", val = 100)
    @What(description = "An annotation test method")
    public static void myMeth() {
        Meta2 ob = new Meta2();

        //obtain the annotation for this method
        //and display the values of the members

        try {

            Annotation annos[] = ob.getClass().getAnnotations();


            System.out.println("All Annotations for Meta2:");
            for(Annotation a: annos)
                System.out.println(a);

            System.out.println();




            //Now, get a Method object that represents
            //this method
            Method m = ob.getClass().getMethod("myMeth");

            //Next, get the annotation for this class
            annos = m.getAnnotations();

            //Finally display the values
            System.out.println("All annotations for method");
            for(Annotation a: annos)
                System.out.println(a);

            System.out.println();

        } catch (NoSuchMethodException e) {
            System.out.println("Method not Found.");
        }
    }
}

class Meta {
    //Annotate a method
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        //obtain the annotation for this method
        //and display the values of the members

        try{
            //First, get a class object that represents
            //this class
            Class<?> c = ob.getClass();

            //Now, get a Method object that represents
            //this method
            Method m = c.getMethod("myMeth");

            //Next, get the annotation for this class
            MyAnno anno = m.getAnnotation(MyAnno.class);

            //Finally display the values
            System.out.println(anno.str() + " "  + anno.val());



        } catch (NoSuchMethodException e) {
            System.out.println("Method not Found.");
        }
    }


}


