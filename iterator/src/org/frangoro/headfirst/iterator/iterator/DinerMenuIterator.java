package org.frangoro.headfirst.iterator.iterator;

import org.frangoro.headfirst.iterator.MenuItem;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.items = menuItems;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return  (items.length > position && items[position] != null);
    }

    @Override
    public Object next() {
        return items[position++];
    }
}
