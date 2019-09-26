package org.frangoro.headfirst.iterator.menu;

import org.frangoro.headfirst.iterator.client.Waitress;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main (String args[]){
        PancakeHoseMenu pancakeHoseMenu = new PancakeHoseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHoseMenu);
        menus.add(dinerMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();

    }
}
