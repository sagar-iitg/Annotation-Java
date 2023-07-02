package com.sk.concept.annotation.exmaple1;

public class Main {


    public static void main(String[] args) {
        System.out.println(new TestClass().getClass().getAnnotation(MyCustomAnnotation.class));

    }
}
