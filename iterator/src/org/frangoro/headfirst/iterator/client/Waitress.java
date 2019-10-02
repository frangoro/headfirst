package org.frangoro.headfirst.iterator.client;

import org.frangoro.headfirst.iterator.composite.MenuComponent;
import org.frangoro.headfirst.iterator.menu.Menu;
import org.frangoro.headfirst.iterator.menu.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

}
