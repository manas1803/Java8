package org.clueless.CollectionFramework.Collection.Set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface
{
    public void TreeSetImplementation(){
        SortedSet st = new TreeSet<>();
        st.add(23);st.add(14);st.add(48);st.add(74);st.add(41);st.add(789);st.add(147);st.add(102);

        System.out.println(st);
    }
    public void ComprableInterfaceTest(){
        System.out.println("A".compareTo("B"));
        System.out.println("Z".compareTo("A"));
        System.out.println("A".compareTo("A"));
    }
    public void ComparatorInTreeSet(){
        SortedSet st = new TreeSet(new MyComparator());
        st.add(23);st.add(14);st.add(48);st.add(74);st.add(41);st.add(789);st.add(147);st.add(102);

        System.out.println(st);
    }
    public void ComparatorDifferentImplementation(){

        // Insertion order preserved
        SortedSet st = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 1;
            }
        });
        st.add(23);st.add(14);st.add(48);st.add(74);st.add(41);st.add(789);st.add(147);st.add(102);
        System.out.println("Maintaining the insertion order");
        System.out.println(st);

        // Insertion order reversed
        SortedSet st1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -1;
            }
        });
        st1.add(23);st1.add(14);st1.add(48);st1.add(74);st1.add(41);st1.add(789);st1.add(147);st1.add(102);
        System.out.println("Reversing the insertion order");
        System.out.println(st1);

        // Only first element inserted
        SortedSet st2 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        st2.add(23);st2.add(14);st2.add(48);st2.add(74);st2.add(41);st2.add(789);st2.add(147);st2.add(102);
        System.out.println("Adding only the first value");
        System.out.println(st2);

        // Insertion in ascending order
        SortedSet st3 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2=(Integer) o2;
                return i1.compareTo(i2);
            }
        });
        st3.add(23);st3.add(14);st3.add(48);st3.add(74);st3.add(41);st3.add(789);st3.add(147);st3.add(102);
        System.out.println("Insertion in ascending order");
        System.out.println(st3);

        // Insertion in descending order
        SortedSet st4 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2=(Integer) o2;
                return -i1.compareTo(i2);
            }
        });
        st4.add(23);st4.add(14);st4.add(48);st4.add(74);st4.add(41);st4.add(789);st4.add(147);st4.add(102);
        System.out.println("Insertion in descending order");
        System.out.println(st4);
    }
    public void ComapartorForStringBasedOnLengthAndThenLexi(){
        SortedSet<String> st = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();

                if(len1<len2)
                    return 1;
                else if(len1>len2)
                    return -1;
                else
                    return o1.compareTo(o2);
            }
        });
        st.add("X");
        st.add("AKNDVVV");
        st.add("AWED");
        st.add("Z");
        st.add("WEF3F");
        st.add("ASDW9");
        System.out.println(st);
    }
}
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;

        if(i1>i2)
            return -1;
        else if(i1<i2)
            return 1;
        else
            return 0;
    }
}
