package org.frangoro.headfirst.iterator;

import org.frangoro.headfirst.iterator.iterator.DinerMenuIterator;
import org.frangoro.headfirst.iterator.iterator.Iterator;

public class Waitress {

    PancakeHoseMenu pancakeHoseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHoseMenu pancakeHoseMenu, DinerMenu dinerMenu) {
        this.pancakeHoseMenu = pancakeHoseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator pancakeHouseMenuIterator = pancakeHoseMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(dinerMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(pancakeHouseMenuIterator);
    }

    private void printMenu(Iterator it) {
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem)it.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription() + ", ");
        }
    }
}
