package com.company;

public class Fruit extends List {
    String command;
    Node currNode;
    Node prev;

    @Override
    public void list() {
        System.out.println("Do you want to 'ADD' - 'RM' - 'EDIT' - 'PRINT' - 'QUIT' ");
        switch (command = scanner.nextLine().toLowerCase()) {
            case "add":
                addItem();
                list();
            case "rm":
                removeItem();
                list();
            case "edit":
                updateItem();
                list();
            case "print":
                print();
                list();
            case "quit":
                return;
            default:
                list();
        }
    }

    @Override
    public void addItem() {
        System.out.println("\nWhat is the item that you want to add: ");
        item = scanner.nextLine();
        if (item == null)
            list();
        System.out.println("How many " + item + " do you want? ");
        amount = scanner.nextInt();
        if (head == null) {
            head = new Node()
        }
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
