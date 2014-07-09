/*
 * Using examples from Head First - Design Patterns
 */
package com.example.adapter.iterator;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Armando
 */
public class EI {

    public static void main(String args[]) {
        Vector v = new Vector(Arrays.asList(args));
        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
