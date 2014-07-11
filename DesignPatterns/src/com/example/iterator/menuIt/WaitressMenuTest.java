/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menuIt;

/**
 *
 * @author Armando
 */
public class WaitressMenuTest {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
