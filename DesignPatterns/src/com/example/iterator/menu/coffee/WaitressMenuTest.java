/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menu.coffee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Armando
 */
public class WaitressMenuTest {

    public static void main(String[] args) {

        List<Menu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new CafeMenu());

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
