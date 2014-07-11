/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menuIt.improved;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Armando
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    
    private List<MenuItem> menuItems;
    private int position = 0;
    
    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    
    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
    
    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (menuItems.get(position - 1) != null) {
            for (int i = position - 1; i < (menuItems.size() - 1); i++) {
                menuItems.set(i, menuItems.get(i + 1));
            }
            menuItems.set(menuItems.size() - 1, null);
        }
    }  
}
