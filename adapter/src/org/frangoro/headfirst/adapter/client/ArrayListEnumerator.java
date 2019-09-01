package org.frangoro.headfirst.adapter.client;

import org.frangoro.headfirst.adapter.adapter.IteratorEnumerator;

import java.util.ArrayList;
import java.util.Enumeration;

public class ArrayListEnumerator {

    ArrayList arrayList;

    public ArrayListEnumerator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public Enumeration enumerator() {
        return new IteratorEnumerator(arrayList.iterator());
    }
}
