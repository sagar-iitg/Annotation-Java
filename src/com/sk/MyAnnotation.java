package com.sk;



//marker annotation --serializable, closeable,


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{


    int myValue() default  0;
    String name() default "Sagar";
    String city() default  "Delhi";

}
