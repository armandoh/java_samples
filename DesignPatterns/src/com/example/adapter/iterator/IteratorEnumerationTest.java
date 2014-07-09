/*
 * Using examples from Head First - Design Patterns
 */
package com.example.adapter.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 *
 * @author Armando
 */
public class IteratorEnumerationTest {

    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {

        ArrayList l = new ArrayList(Arrays.asList(new String[]{"D", "X", "M"}));
        Enumeration enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
