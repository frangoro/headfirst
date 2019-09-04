package org.frangoro.headfirst.iterator.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

    ArrayList items;
    int position;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return items.size() > position;
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
