package com.company;

import java.util.Scanner;

public abstract class List {
    Scanner scanner = new Scanner(System.in);
    Node head;
    String item;
    int amount;

    public abstract void list();
    public abstract void addItem();
    public abstract void removeItem();
    public abstract void updateItem();
    public abstract void print();
}
