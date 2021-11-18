package org.clueless.CollectionFramework.Collection.List;

import java.util.*;

public class Cursors {
    public void EnumertionCursor(){
        Vector<Integer> v = new Vector<>(10,5);
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<12;i++){
            v.addElement(i);
            al.add(i);
        }
        System.out.println(v.capacity());
        System.out.println(al.size());

        Enumeration<Integer> ev = v.elements();

        System.out.println("Vector :-");
        while(ev.hasMoreElements()){
            Integer i = ev.nextElement();
                if(i%2==0)
                    System.out.print(i + ", ");

        }
        System.out.println();
        System.out.println(v);
    }
    public void IteratorCursor(){
        Vector<Integer> v = new Vector<>(10,5);
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<12;i++){
            v.addElement(i);
            al.add(i);
        }
        System.out.println(v.capacity());
        System.out.println(al.size());

        Iterator<Integer> evit = v.iterator();
        Iterator<Integer> alit = al.iterator();

        System.out.println("Vector :-");
        while(evit.hasNext()){
            Integer i = evit.next();
            if(i%2==0)
                System.out.print(i + ", ");
            else
                evit.remove();
        }
        System.out.println();
        System.out.println(v);

        System.out.println("ArrayList :-");
        while(alit.hasNext()){
            Integer i = alit.next();
            if(i%2==0)
                System.out.print(i + ", ");
            else
                alit.remove();
        }
        System.out.println();
        System.out.println(v);
    }
    public void ListIteratorCursor(){

    }
}
