package org.frangoro.headfirst.iterator.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    String name;
    String description;
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {

        System.out.print("\n" + getName());
        System.out.println(",  " + getDescription());
        System.out.println("-------------------");

        Iterator<MenuComponent> menuComponentIterator = menuComponents.iterator();
        while (menuComponentIterator.hasNext()){
            MenuComponent menuComponent = menuComponentIterator.next();
            menuComponent.print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }
}
