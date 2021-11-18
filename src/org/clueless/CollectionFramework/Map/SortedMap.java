package org.clueless.CollectionFramework.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class SortedMap {
    public void TreeMapImplementation(){
        TreeMap tmap = new TreeMap();
        tmap.put(102,111);
        tmap.put(1,234);
        tmap.put(12,24);

        java.util.SortedMap<Integer,Integer> headMap =  tmap.headMap(12);

        java.util.SortedMap<Integer,Integer> tailMap = tmap.tailMap(12);

    System.out.println(headMap);
    System.out.println(tailMap);
        System.out.println(tmap);


    }
    class myComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            return 0;
        }
    }
}
