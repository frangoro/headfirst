package org.frangoro.headfirst.iterator.test;

import org.frangoro.headfirst.iterator.client.Waitress;
import org.frangoro.headfirst.iterator.composite.Menu;
import org.frangoro.headfirst.iterator.composite.MenuComponent;
import org.frangoro.headfirst.iterator.composite.MenuItem;
import org.frangoro.headfirst.iterator.menu.DinerMenu;
import org.frangoro.headfirst.iterator.menu.PancakeHoseMenu;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main (String args[]){

        MenuComponent pancakeMenu = new Menu("Menu Pancake", "Breakfast");
        MenuComponent dinerMenu = new Menu("Menu Diner", "Diner");
        MenuComponent lunchMenu = new Menu("Menu lunch", "Lunch");
        MenuComponent dessertMenu = new Menu("Menu Dessert", "Lunch");
        lunchMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Fruit","sweet fruit", true, 0.5d));

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");
        allMenus.add(pancakeMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinerMenu);

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

    }
}
