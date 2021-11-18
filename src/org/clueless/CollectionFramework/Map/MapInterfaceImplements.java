package org.clueless.CollectionFramework.Map;

import java.util.*;

public class MapInterfaceImplements{
    public void HashMapImple(){
        Map<Character,Integer> mp = new HashMap<>();
        String str = "aasdberkbnlwnlknlcnenrlnlsaansmncoenconconsnnceoncronrnrpnnlncencncnrpnpjopjfpfjhroibcwbcorboicbo";
        char[] chr = str.toCharArray();
        for(int i=0;i<chr.length;i++){
            if(mp.containsKey(chr[i])){
                mp.put(chr[i],1+mp.get(chr[i]));
            }
            else{
                mp.put(chr[i],1);
            }
        }
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public void HashMapMethods(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("bruce",102);
        map.put("clark",105);
        map.put("henry",100);

        System.out.println(map);

        System.out.println(map.put("henry",106));

        Set keys = map.keySet();
        System.out.println(keys);

        Collection collection = map.values();
        System.out.println(collection);

        Set entry = map.entrySet();
        System.out.println(entry);

        Iterator ite = entry.iterator();

        while(ite.hasNext()){
            Map.Entry entry1 = (Map.Entry)ite.next();
            System.out.println("The key from the entry is " + entry1.getKey() + " and the value from the key is " + entry1.getValue());

            if(entry1.getKey().equals("clark")){
                entry1.setValue(10005);
            }
            System.out.println("The key from the entry is " + entry1.getKey() + " and the value from the key is " + entry1.getValue());
        }
    }
    public void DifferenceWeakHashMapAndHashMap() throws Exception{
        HashMap mp = new HashMap();
        Temp t1 = new Temp();
        mp.put(t1,"Durga");
        System.out.println(mp);
        t1=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(mp);

        WeakHashMap map = new WeakHashMap();
        Temp t = new Temp();
        map.put(t,"Durga");
        System.out.println(map);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(map);
    }
}
class Temp{
    public String toString(){
        return "temp";
    }
    protected void finalize(){
        System.out.println("Garbage collection has come here");
    }
}
