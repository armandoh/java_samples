/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menuIt;

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
    
}
