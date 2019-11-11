package com.company;

public class Dairy extends List {
    String command;

    @Override
    public void list() {
        System.out.println("Do you want to 'ADD' - 'RM' - 'EDIT' - 'PRINT' - 'QUIT' ");
        switch (command = scanner.nextLine().toLowerCase()) {
            case "add":
                addItem();
            case "rm":
                removeItem();
            case "edit":
                updateItem();
            case "print":
                print();
            case "quit":
                return;
            default:
                list();
        }
    }
    @Override
    public void addItem() {
        System.out.println("What is the item that you want to add: ");
        item = scanner.nextLine();
        if (item.toLowerCase().equals("quit"))
            return;
        System.out.println("How many " + item + " do you want? ");
        amount = scanner.nextInt();
    }

    @Override
    public void removeItem() {

    }

    @Override
    public void updateItem() {

    }

    @Override
    public void print() {

    }
}




