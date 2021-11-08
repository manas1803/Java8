package org.clueless.Java8Features.Generics;

import java.util.List;

public class GenericTypesAndBoundedParams {
    public static <T extends Comparable<T>> int countGreaterThan(T[] tarray,T elem){
        int count=0;
        for(T e : tarray){
            if(e.compareTo(elem)>0)
                count++;
        }
        return count;
    }
    public static Double sumOfList(List<? extends Number> list){
        Double sum=0.0;
        for(Number ele:list){
            
        }
        return sum;
    }
}
