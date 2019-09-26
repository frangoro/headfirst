package org.frangoro.headfirst.iterator;

import org.frangoro.headfirst.iterator.menu.Menu;
import org.frangoro.headfirst.iterator.menu.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> it) {
        while (it.hasNext()) {
            MenuItem menuItem = it.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription() + ", ");
        }
    }
}
