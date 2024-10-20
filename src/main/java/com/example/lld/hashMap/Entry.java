package com.example.lld.hashMap;

public class Entry<K, V> {
    public K k;
    public V v;
    public Entry next;

    public Entry(K k, V v) {
        this.k = k;
        this.v = v;
        this.next = null;
    }
}
