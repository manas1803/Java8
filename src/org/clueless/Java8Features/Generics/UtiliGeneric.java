package org.clueless.Java8Features.Generics;

public class UtiliGeneric
{
    public static <K,V> boolean compare(Pairs<K,V> p1, Pairs<K,V> p2){
        return p1.getK().equals(p2.getK()) && p1.getV().equals(p2.getV());
    }
    public <U extends Number> void Inspect(U u){
    System.out.println(u.getClass());
    System.out.println(u.getClass().getName());
    }
}
class Pairs<K,V>{
    private K k;
    private V v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
