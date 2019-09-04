package org.frangoro.headfirst.iterator;

import org.frangoro.headfirst.iterator.iterator.DinerMenuIterator;
import java.util.Iterator;

public class Waitress {

    Menu pancakeHoseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHoseMenu, Menu dinerMenu) {
        this.pancakeHoseMenu = pancakeHoseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHoseMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(dinerMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(pancakeHouseMenuIterator);
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
