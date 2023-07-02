package com.sk.concept.annotation.safevarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Log {

    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumberList)
    {
        Object[] objectList=logNumberList;
        List<String> stringValueList=new ArrayList<>();
        stringValueList.add("hello");
        objectList[0]=stringValueList;

     }
}
