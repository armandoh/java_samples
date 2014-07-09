/*
 * Using examples from Head First - Design Patterns
 */
package com.example.adapter.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Armando
 */
public class EnumerationIteratorTest {

    public static void main(String args[]) {
        Vector v = new Vector(Arrays.asList(new String[]{"C", "Z", "N"}));
        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
