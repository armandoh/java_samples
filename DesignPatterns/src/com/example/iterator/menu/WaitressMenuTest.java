/*
 * Using examples from Head First - Design Patterns
 */
package com.example.iterator.menu;

import java.util.List;

/**
 *
 * @author Armando
 */
public class WaitressMenuTest {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();       
        
        for(MenuItem item: breakfastItems){
            System.out.println(item.getName() + " ");
            System.out.println(item.getPrice() + " ");
            System.out.println(item.getDescription());
        }
        
        /*
        //Using Java 8 - lambdas
        breakfastItems.stream().map((item) -> {
            System.out.println(item.getName() + " ");
            return item;
        }).map((item) -> {
            System.out.println(item.getPrice() + " ");
            return item;
        }).forEach((item) -> {
            System.out.println(item.getDescription() + " ");
        });        
        */
        
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        
        for (MenuItem item : lunchItems) {
            //It might contain null elements
            if (item != null) {
                System.out.println(item.getName() + " ");
                System.out.println(item.getPrice() + " ");
                System.out.println(item.getDescription());
            }

        }        
    }
}
