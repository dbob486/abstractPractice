package com.company;

public class Grocery {
    List dairy = new Dairy();
    List fruit = new Fruit();
    List vegetable = new Vegetable();

    public Grocery(int a) {
        switch (a) {
            case 1:
                dairy.list();
            case 2:
                fruit.list();
            case 3:
                vegetable.list();
            case 4:
                return;
        }
    }
}
