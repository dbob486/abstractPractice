package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reminder that nothing is case sensitive so make sure you just spell correctly! \n");
        init();
    }

    public static void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat category are you going choose to add your item to: '1' DAIRY, '2' FRUITS, '3' VEGETABLES, '4' QUIT");
        int a = scanner.nextInt();
        new Grocery(a);
    }
}

