package org.clueless.CollectionFramework.Collection.List;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;

public class ListInterface {
    public void ListImplmentaions(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        List<Integer> vector = new Vector<>();
        List<Integer> stack = new Stack<>();



        Vector<Integer> vector2 = new Vector<>();
        Vector<Integer> stack2 = new Stack<>();
    }

    public void AddDataToList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(23);
        linkedList.add(235);
        linkedList.add(12);
        arrayList.add(45);
        arrayList.addAll(1,linkedList);
        arrayList.add(4,123);

        for(Integer x : arrayList){
            System.out.println("The values inside the arrayList are "+x);
        }
        System.out.println();
    }
    public void RemoveDataFromList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(23);
        linkedList.add(235);
        linkedList.add(12);
        arrayList.add(45);
        arrayList.addAll(1,linkedList);
        arrayList.add(4,123);

        for(Integer x : arrayList){
            System.out.println("The values inside the arrayList are "+x);
        }
        System.out.println();


        arrayList.remove(1);
        for(Integer x : arrayList){
            System.out.println("The values inside the arrayList are "+x);
        }
        System.out.println();

        Integer x2 = 235;
        arrayList.remove(x2);
        for(Integer x : arrayList){
            System.out.println("The values inside the arrayList are "+x);
        }
        System.out.println();
    }
    public void IndexOfList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(23);
        linkedList.add(235);
        linkedList.add(12);
        arrayList.add(45);
        arrayList.addAll(1,linkedList);
        arrayList.add(4,123);
        arrayList.add(235);
        int indexOf = arrayList.indexOf(235);
        int lastIndexOf = arrayList.lastIndexOf(235);
        System.out.println("First index of 235 is " + indexOf + " and last index of 235 is " + lastIndexOf);
        System.out.println();
    }
    public void GetSetList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(23);
        linkedList.add(235);
        linkedList.add(12);
        arrayList.add(45);
        arrayList.addAll(1,linkedList);
        arrayList.add(4,123);
        int val = arrayList.get(2);
        arrayList.set(2,23456);
        System.out.println("Value at index 2 before change is " + val);
        System.out.println();
        for(Integer x : arrayList){
            System.out.println("The values inside the arrayList are "+x);
        }
        System.out.println();
    }
    public void IteratingTheList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        linkedList.add(23);
        linkedList.add(235);
        linkedList.add(12);
        arrayList.add(45);
        arrayList.addAll(1,linkedList);
        arrayList.add(4,123);


        System.out.println();
    }
    public void CheckInterfaces(){
        List<Integer> al = new ArrayList<>();
        List<Integer> ve = new Vector<>();
        List<Integer> li = new LinkedList<>();

        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof Cloneable);
        System.out.println(al instanceof RandomAccess);
        System.out.println();
        System.out.println(ve instanceof Serializable);
        System.out.println(ve instanceof Cloneable);
        System.out.println(ve instanceof RandomAccess);
        System.out.println();
        System.out.println(li instanceof Serializable);
        System.out.println(li instanceof Cloneable);
        System.out.println(li instanceof RandomAccess);
    }
    public void SynchronizeArrayList(){
        List<Integer> al = new ArrayList<>();
        List<Integer>all = Collections.synchronizedList(al);
        all.add(25);
    }

    public void LinkedListConstructors(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);al.add(222);al.add(123);
        LinkedList<Integer> li = new LinkedList<>(al);

        System.out.println(li);
    }
}
