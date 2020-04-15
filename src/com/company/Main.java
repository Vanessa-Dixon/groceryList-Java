package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public  static Grocery groceryList = new Grocery();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        scan.nextLine();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
            }

        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list. ");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application");
        System.out.println("Enter your choice: ");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item name: ");
        String itemNo = scan.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryList(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name : ");
        String itemNo = scan.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Enter item: ");
        String searchItem = scan.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our groceryList");
        }
        else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

//        can also be written as happens at the time you are you are creating the array
        ArrayList<String> name = new ArrayList<>(groceryList.getGroceryList());
      
    }

}
