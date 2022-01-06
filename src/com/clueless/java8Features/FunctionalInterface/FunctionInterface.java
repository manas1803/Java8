package com.clueless.java8Features.FunctionalInterface;

import com.clueless.java8Features.Student;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterface {
    public void FunctionImplementation(){
        Function<Integer,Integer> f1 = (i)->i*i;

        System.out.println(f1.apply(25));
    }
    public void LengthOfString(){
        Function<String,Integer> f1 = (String st)->{
          return st.length();
        };

        System.out.println(f1.apply("My Name is Manas Pant"));
    }
    public void CombineFunctions(){
        Function<Integer,Integer> f1 = (i)->i*i*i;
        Function<Integer,Integer> f2 = (i)->2*i;

        System.out.println(f1.andThen(f2).apply(4));
        System.out.println(f1.compose(f2).apply(4));
    }
    public void StudentFunctionInterface(){
        Function<Student,String> f1 = (st)->{
            if(st.getMarks()>95)
                return "A+";
            else if(st.getMarks()>85)
                return "B+";
            else if(st.getMarks()>75)
                return "C+";
            else if(st.getMarks()>65)
                return "D+";
            else
                return "F";
        };
        Predicate<Student> p1 = (st)->(st.getMarks()>60);


    }
}
