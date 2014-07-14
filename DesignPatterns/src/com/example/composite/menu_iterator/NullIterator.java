/*
 * Using examples from Head First - Design Patterns
 */
package com.example.composite.menu_iterator;

import java.util.Iterator;

/**
 *
 * @author Armando
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
