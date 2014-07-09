/*
 * Using examples from Head First - Design Patterns
 */
package com.example.adapter.iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author Armando
 */
public class IteratorEnumeration implements Enumeration {

    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

}
