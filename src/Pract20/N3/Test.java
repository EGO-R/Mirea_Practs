package Pract20.N3;

import java.io.Serializable;

public class Test <T extends Comparable<T>, V extends Animal & Serializable, K>{
    private T t;
    private V v;
    private K k;
    public Test(T t1, V v1, K k1){
        t = t1;
        v = v1;
        k = k1;
    }

    public T getT() {
        return t;
    }
    public V getV() {
        return v;
    }
    public K getK() {
        return k;
    }
    public void ClassesOut(){
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }

    public static void main(String[] args) {
        Test obj = new Test(5, new AnimalSeria(), 23.1231);
        System.out.println(obj.getT());
        System.out.println(obj.getV());
        System.out.println(obj.getK());
        obj.ClassesOut();
    }
}
