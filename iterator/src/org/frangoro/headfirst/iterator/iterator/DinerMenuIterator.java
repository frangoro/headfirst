package org.frangoro.headfirst.iterator.iterator;

import org.frangoro.headfirst.iterator.MenuItem;

public class DinerMenuIterator implements java.util.Iterator {

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

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You cant't remove an item until you've done at least one next()");
        }
        if (items[position-1] != null){
            for (int i = position-1; i<(items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length - 1] = null;
        }
    }
}
