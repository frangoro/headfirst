package org.frangoro.headfirst.iterator;

import org.frangoro.headfirst.iterator.iterator.DinerMenuIterator;
import org.frangoro.headfirst.iterator.iterator.Iterator;
import org.frangoro.headfirst.iterator.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;

public class PancakeHoseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHoseMenu(){
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public java.util.Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
