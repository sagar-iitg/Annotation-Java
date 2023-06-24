package com.sk;

import java.lang.annotation.Annotation;

public class MainExample {


    public static void main(String[] args) {
        Demo d=new Demo();

        Class c = d.getClass();
        System.out.println(c.getName());
        MyAnnotation annotation =(MyAnnotation) c.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.myValue());
        System.out.println(annotation.name());
        System.out.println(annotation.city());



    }
}
