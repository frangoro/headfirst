package org.frangoro.headfirst.adapter.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerator implements Enumeration<Object> {

    Iterator<?> iterator;

    public IteratorEnumerator(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
