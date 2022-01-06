package com.clueless.java8Features.FunctionalInterface;

// We use predicate interface wherever we want to do conditional checking

import com.clueless.java8Features.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateInterface {
    public void ImplementingPredicates(){
        Predicate<Integer> p1 = (i)->i%2==0;
        System.out.println(p1.test(120));
    }
    public void getStringOfLengthGretaerThan10(){
        Predicate<String> p1 = (st)->st.length()>10;
        String[] str = {"Bruce Wayne","Clark Kent","Barry Allen","Diana Princess","Oliver Queen"};

        for(String st:str){
            if(p1.test(st)){
                System.out.println(st);
            }
        }
    }
    public void joiningThePredicate(){
        Predicate<Integer> p1 = (i)->i%2==0;
        Predicate<Integer> p2 = (i)->i>100;

        System.out.println(p1.and(p2).test(212));
        System.out.println(p1.or(p2).test(98));
        System.out.println(p1.negate().test(1));
    }
    public void PredicateWithStudents(){
        ArrayList<Student> al = new ArrayList<>();
        Predicate<Student> p1 = (st)->st.getMarks()>95;
        Predicate<Student> p2 = (st)->st.getName().length()>10;

        al.add(new Student(101,"Bruce Wayne",97));
        al.add(new Student(102,"Clark Kent",96));
        al.add(new Student(103,"Diana Princess",95));
        al.add(new Student(104,"Barry Allen",94));
        al.add(new Student(105,"Hal Jordan",93));
        al.add(new Student(106,"Oliver Queen",92));

        for(Student st : al){
            if(p1.and(p2).test(st)){
                System.out.println(st);
            }
        }
    }
}
