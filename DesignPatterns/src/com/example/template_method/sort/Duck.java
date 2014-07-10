/*
 * Using examples from Head First - Design Patterns
 */
package com.example.template_method.sort;

/**
 *
 * @author Armando
 */
public class Duck implements Comparable<Duck> {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

    /*
     //Use this method if comparable interface is implemented without using generics
     //"implements Comparable"
    
     @Override
     public int compareTo(Object o) {
     Duck otherDuck = (Duck) o;

     if (this.weight < otherDuck.weight) {
     return -1;
     } else if (this.weight == otherDuck.weight) {
     return 0;
     } else {
     return 1;
     }
     }

     */
    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }

}
