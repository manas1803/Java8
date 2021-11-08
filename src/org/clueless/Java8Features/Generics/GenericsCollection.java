package org.clueless.Java8Features.Generics;

import java.util.ArrayList;

public class GenericsCollection {
    public void GenericCollections(){
        ArrayList al = new ArrayList();
        /*This does not throw error as we are not specifying generic here*/
        al.add("Manas");
        al.add(2);

        ArrayList<Integer> all = new ArrayList<>();
        all.add(3);
        /*This throws error*/
        //all.add("Manas");


    }
}
