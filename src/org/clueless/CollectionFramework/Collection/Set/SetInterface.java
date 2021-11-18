package org.clueless.CollectionFramework.Collection.Set;

import java.util.*;

public class SetInterface {
    public void HashSetImplementaion(){
        HashSet hs = new HashSet();
        hs.add("A");
        hs.add("X");
        hs.add("Z");
        hs.add(null);
        hs.add("Q");

        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add("A");
        hs1.add("X");
        hs1.add("Z");
        hs1.add(null);
        hs1.add("Q");

        System.out.println(hs);
        System.out.println(hs1);


    }
    public void SortedSetDetails(){
        SortedSet ss = new TreeSet();

        for(int i=0;i<10;i++)
            ss.add(i+1);

        SortedSet ss1 = ss.headSet(3);
        SortedSet ss2 = ss.tailSet(3);

        SortedSet ss3 = ss.subSet(3,8);

        Integer first = (Integer)ss.first();
        Integer last = (Integer)ss.last();

        System.out.println("First element of the set is" + first);
        System.out.println("Last element of the set is " + last);
        System.out.println("Actually set is " + ss);
        System.out.println("Set with headset is " + ss1);
        System.out.println("Set with tailset is " + ss2);

    }
}
