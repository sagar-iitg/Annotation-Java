package com.sk.concept.annotation.example2;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{

    int age() default 34;
    String country() default "India";

}

// i am learning the annotation
//practice code

@CricketPlayer(age = 43,country = "India")
//@CricketPlayer
class Virat{

    int runs;
    int innings;

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public int getInnings() {
        return innings;
    }
}


class LaunchAn {


    public static void main(String[] args) {
        Virat obj=new Virat();
       obj.setRuns(19000);
       obj.setInnings(250);
        System.out.println(obj.getInnings());
        System.out.println(obj.getRuns());
       // System.out.println(obj.);

        Class<? extends Virat> c= obj.getClass();
        Annotation annotation = c.getAnnotation(CricketPlayer.class);
        //downcast it
        CricketPlayer cp=(CricketPlayer)annotation;
        System.out.println(cp.age());
        System.out.println(cp.country());







    }
}


