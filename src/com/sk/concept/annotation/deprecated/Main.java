package com.sk.concept.annotation.deprecated;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Mobile m=new Mobile();

        m.dummyMethod();

    }
}
