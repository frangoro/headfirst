package org.frangoro.headfirst.iterator;

public class MenuTestDrive {
    public static void main (String args[]){
        PancakeHoseMenu pancakeHoseMenu = new PancakeHoseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHoseMenu, dinerMenu);

        waitress.printMenu();

    }
}
