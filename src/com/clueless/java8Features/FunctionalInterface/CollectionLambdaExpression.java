package com.clueless.java8Features.FunctionalInterface;

import com.clueless.java8Features.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class CollectionLambdaExpression {
    public void CompareLists(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(123);
        al.add(154);
        al.add(120);
        al.add(12);
        al.add(13);
        al.add(987);

        System.out.println(al);
        Comparator<Integer> c = (Integer i1,Integer i2)->{
            if(i2>i1)
                return 1;
            else if(i2<i1)
                return -1;
            else
                return 0;
        };

        Collections.sort(al,c);

        System.out.println(al);
    }
    public void SortingTreeSets(){
        TreeSet<Integer> ts = new TreeSet<>((Integer i1,Integer i2)->{
            if(i2>i1) return 1;
            else if(i2<i1) return -1;
            else return 0;
        });
        ts.add(123);
        ts.add(154);
        ts.add(120);
        ts.add(12);
        ts.add(13);
        ts.add(987);

        System.out.println(ts);
    }
    public void CompareStudents(){
        ArrayList<Student> al = new ArrayList<>();

        al.add(new Student(101,"Bruce Wayne",98));
        al.add(new Student(102,"Clark Kent",96));
        al.add(new Student(107,"John Stewart",84));
        al.add(new Student(105,"Hal Jordan",88));
        al.add(new Student(104,"Barry Allen",95));
        al.add(new Student(103,"Dianan Princess",97));
        al.add(new Student(106,"Oliver Queen",89));

        System.out.println(al);
        Collections.sort(al,(Student s1,Student s2)-> (s1.getMarks()>s2.getMarks()) ? -1 : (s1.getMarks()<s2.getMarks()) ? 1 : 0
        );

        System.out.println(al);
    }
}
