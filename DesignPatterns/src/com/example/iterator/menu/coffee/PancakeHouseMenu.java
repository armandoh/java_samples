/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menu.coffee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Armando
 */
public class PancakeHouseMenu implements Menu{

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Wafles", "Wafles, with your choice of blueberries or strawberries", true, 3.59);

    }

    private void addItem(String name,
            String description,
            boolean vegetarian,
            double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }

    /*
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    */
    
    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }    

}
