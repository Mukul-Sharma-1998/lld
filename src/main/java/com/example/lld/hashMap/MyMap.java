package com.example.lld.hashMap;

public class MyMap<K, V> {
    public int currentSize;
    public int bucketInUse = 0;
    public static final int minimumSize = 1<<4;
    public static final int maximumSize = 1<<30;
    public static final int resizingLimit = 75;

    public Entry[] entries;

    public MyMap() {
        this.currentSize = minimumSize;
        this.entries = new Entry[minimumSize];
    }

    public MyMap(int size) {
        int startSize = minimumSize;
        while(startSize < size) {
            startSize = startSize << 1;
        }
        this.currentSize = startSize;
        this.entries = new Entry[startSize];
    }

    public V get(K k){
        // TODO: implement the get logic
        int ind = k.hashCode() & (this.currentSize - 1);
        Entry startEntry = this.entries[ind];
        while(startEntry != null) {
            if(startEntry.k == k){
                return (V) startEntry.v;
            }
            startEntry = startEntry.next;
        }
        System.out.println("this key is not present in the map");
        return null;
    }

    public V put(K k, V v) {
        int ind = k.hashCode() & (this.currentSize - 1);
        return makeEntry(k, v, ind);
    }

    private V makeEntry(K k, V v, int ind) {
        Entry entry = this.entries[ind];
        if(entry == null) {
            Entry newEntry = new Entry<>(k, v);
            this.entries[ind] = newEntry;
            this.bucketInUse++;
            updateTheBucketSize();
            return v;
        }

        while(true) {
            if(entry.k == k) {
                entry.v = v;
                return v;
            } else {
                if(entry.next == null) {
                    Entry newEntry = new Entry<>(k, v);
                    entry.next = newEntry;
                    return v;
                }
                entry = entry.next;
            }
        }
    }

    private void updateTheBucketSize() {
        if((this.bucketInUse * 100) / this.currentSize >= resizingLimit) {
            System.out.println("Resizing needs to be done");
            this.currentSize = this.currentSize << 1;
            Entry[] newEntries = new Entry[this.currentSize];
            System.arraycopy(this.entries, 0, newEntries, 0, this.entries.length);
            this.entries = newEntries;

        }
    }
}
